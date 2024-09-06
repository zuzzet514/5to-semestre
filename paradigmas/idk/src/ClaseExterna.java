public class ClaseExterna {
    private String nombre = "Morales";

    public class ClaseInterna {
        public void saludar() {
            System.out.println("Hola");
        }
    }

    public void metodoExterno() {
        class ClaseLocal {
            public void  saludarClaseLocal() {
                System.out.println("Hola " + nombre);
            }
        }

        ClaseLocal cl = new ClaseLocal();
        cl.saludarClaseLocal();
    }
}
