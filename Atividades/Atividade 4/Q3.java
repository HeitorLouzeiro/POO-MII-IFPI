/* 3. A sintaxe do uso de interfaces pode parecer muito estranha, à primeira vista. Vamos 
começar com um exercício para praticar a sintaxe: */

interface AreaCalculavel {
    double calculaArea();
}
class Quadrado implements AreaCalculavel {
    private int lado;
    public Quadrado(int lado) { 
        this.lado = lado;
    }
    public double calculaArea() {
        return this.lado * this.lado;
    }
}
class Retangulo implements AreaCalculavel { 
    private int largura;
    private int altura;
    
    public Retangulo(int largura, int altura) { 
        this.largura = largura;
        this.altura = altura;
    }
    public double calculaArea() {
        return this.largura * this.altura;
    }
}

class Circulo implements AreaCalculavel {
// ... atributos (raio) e métodos (calculaArea)
    private int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }
    public double calculaArea() {
        return Math.PI * this.raio * this.raio;
    }
}

class Q3 {
    public static void main(String[] args) {
        AreaCalculavel a = new Retangulo(3,2);
        System.out.println(a.calculaArea());
    }
}