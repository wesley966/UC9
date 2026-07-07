const readlineSync = require('readline-sync');

class Cliente {
    nome: string;
    email: string;
    telefone: string;
    idade: number;

    constructor(nome: string, email: string, telefone: string, idade: number) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.idade = idade;
    }
    public cadastrar(): void {
        console.log(`Cliente ${this.nome} cadastrado com sucesso!`);
    }
}
 const cliente1 = new Cliente("João Silva", "Joao@email.com", "123456789", 30);
 const cliente2 = new Cliente("Maria Oliveira", "Maria@email.com", "987654321", 25);

class JogoGame {
    nome: string;
    plataforma : string;
    genero: string;
    valorDiaria: number;
    disponivel: boolean = true;

    constructor(nome: string, plataforma: string, genero: string, valorDiaria: number, disponivel: boolean = true) {
        this.nome = nome;
        this.plataforma = plataforma;
        this.genero = genero;
        this.valorDiaria = valorDiaria;
        this.disponivel = disponivel;
    }
    public alugar(): void {
        if (this.disponivel) {
            this.disponivel = false;
            console.log(`O jogo ${this.nome} foi alugado com sucesso!`);
        } else {
            console.log(`O jogo ${this.nome} não está disponível para aluguel.`);
        }
    }
}
const jogo1 = new JogoGame("The Legend of Zelda: Breath of the Wild", "Nintendo Switch", "Ação/Aventura", 15.00);
const jogo2 = new JogoGame("God of War", "PlayStation 4", "Ação/Aventura", 12.00);

class Locacao {
    cliente: Cliente;
    jogo: JogoGame;
    dataLocacao: Date;
    dataDevolucao: Date;
   

    constructor(cliente: Cliente, jogo: JogoGame, dataLocacao: Date, dataDevolucao: Date) {
        this.cliente = cliente;
        this.jogo = jogo;
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
      
    }
    public Locar(): void {
       console.log(`O cliente ${this.cliente.nome} alugou o jogo ${this.jogo.nome} de ${this.dataLocacao.toLocaleDateString()} até ${this.dataDevolucao.toLocaleDateString()}.`);
   }
}
const locacao1 = new Locacao(cliente1, jogo1, new Date('2024-06-01'), new Date('2024-06-05'));
const locacao2 = new Locacao(cliente2, jogo2, new Date('2024-06-02'), new Date('2024-06-06'));

function RodarServicoDeLocacao() {
const qualJogo = readlineSync.question(`
    
    Qual jogo deseja alugar?

    1- The Legend of Zelda: Breath of the Wild
    2- God of War `);
    if (qualJogo === '1') {
        jogo1.alugar();
    } else if (qualJogo === '2') {
        jogo2.alugar();
    }
    const nomeJogo = qualJogo === '1' ? jogo1.nome : jogo2.nome;
    const plataformaJogo = qualJogo === '1' ? jogo1.plataforma : jogo2.plataforma;
    const generoJogo = qualJogo === '1' ? jogo1.genero : jogo2.genero;
    const valorDiariaJogo = qualJogo === '1' ? jogo1.valorDiaria : jogo2.valorDiaria;

const qualCliente = readlineSync.question(`
    
    Qual cliente deseja alugar o jogo? 
    
    1- João Silva
    2- Maria Oliveira `);
    if (qualCliente === '1') {
         cliente1.cadastrar();
    } else if (qualCliente === '2') {
        cliente2.cadastrar();
    }

    const nomeCliente = qualCliente === '1' ? cliente1.nome : cliente2.nome;

    const qualLocacao = readlineSync.question(`
    Qual locacao deseja realizar?

    1- Locacao 1
    2- Locacao 2 `);
   if (qualLocacao === '1') {
     locacao1.Locar();
   } else if (qualLocacao === '2') {
       locacao2.Locar();
    }

    
    const dataLoca = qualLocacao === '1' ? locacao1.dataLocacao : locacao2.dataLocacao;
    const dataDevol = qualLocacao === '1' ? locacao1.dataDevolucao : locacao2.dataDevolucao;
    const valorPrevisto = valorDiariaJogo * ((dataDevol.getTime() - dataLoca.getTime()) / (1000 * 3600 * 24));

    console.log(`
    ==========================
    RESUMO DA LOCACAO DE JOGOS
    ==========================

    Jogo locado: ${nomeJogo}
    Plataforma: ${plataformaJogo}
    Genero: ${generoJogo}
    Cliente: ${nomeCliente}
    Data de locação: ${dataLoca}
    Data de devolução: ${dataDevol}
    Valor previsto para pagamento: R$ ${valorPrevisto.toFixed(2)}
    Situacao de devolução: ${qualLocacao === '1' ? (jogo1.disponivel ? '😎Devolvido' : '(┬┬﹏┬┬)Não devolvido') : (jogo2.disponivel ? '😎Devolvido' : '(┬┬﹏┬┬)Não devolvido')}
    `)
    console.log(`Obrigado por utilizar nosso serviço de locação de jogos!`);
   
    }
    RodarServicoDeLocacao();