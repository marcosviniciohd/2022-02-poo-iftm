package br.edu.iftm.estudante.marcos.fernandes.aula20220830;

public class App {
    public static void main(String[] args) {
        Pessoa<String, String> p1 = new Pessoa<>("Marcos Vinício", "12345678910", "MG1466452");
        Pessoa<Integer, String> p2 = new Pessoa<>("Marcos Vinício", 123456789, "MG13414123654");
        Pessoa<Long, Integer> p3 = new Pessoa<>("Marcos Vinício", 123456789L, 1415027);
        Pessoa<Float, Integer> p4 = new Pessoa<>("Marcos Vinício", 123456789f, 1415027);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
