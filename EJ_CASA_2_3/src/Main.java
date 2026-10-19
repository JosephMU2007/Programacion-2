public class Main {
    public static void main(String[] args) {
        Tarea t1 = new Tarea();

        t1.setTitulo("Diseño de interfaz");
        t1.setResponsable("Joseph");
        t1.setHorasEstimadas(10.0);
        t1.setCompletada(false);

        System.out.println(t1.getTitulo());
        System.out.println(t1.getResponsable());
        System.out.println(t1.getHorasEstimadas());
        System.out.println(t1.isCompletada());
    }
}