public class Main {
    public static void main(String[] args) {
        Stos stos = new Stos(10);

        stos.push(10);
        stos.push(11);
        stos.push(12);
        stos.push(13);

        System.out.println(stos.top());
        System.out.println(stos.pop());
        System.out.println(stos.isEmpty());

    }

}