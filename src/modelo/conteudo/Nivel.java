package modelo.conteudo;

public enum Nivel {

   NIVEL20 {
       @Override
       public int calcularNivel(int NEX) {
           if (NEX > 20) {
               return 4;
           }
           return NEX/5;
       }
   },
    NIVEL40 {
        @Override
        public int calcularNivel(int NEX) {
            if (NEX > 40) {
                return  4;
            }
            return (NEX/5)-4;
        }
    }, NIVEL60 {
        @Override
        public int calcularNivel(int NEX) {
            if (NEX > 60) {
                return  4;
            }
            return (NEX/5)-8;
        }
    }, NIVEL80 {
        @Override
        public int calcularNivel(int NEX) {
            if (NEX > 80) {
                return  4;
            }
            return (NEX/5)-12;
        }
    }, NIVEL95 {
        @Override
        public int calcularNivel(int NEX) {
            if (NEX > 95) {
                return  3;
            }
            return (NEX/5)-16;
        }
    };

   public abstract int calcularNivel(int NEX);

}
