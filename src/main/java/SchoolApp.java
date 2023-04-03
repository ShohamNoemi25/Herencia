public class SchoolApp {

        public static void main(String[] args) {

            Teacher teacher1 = new Teacher("daniel","mendoza","danielmendoza@gmail.com","iguala.gro");
            Student student1 = new Student("Shoham","Medina","medinashoham@gmail.com","iguala.gro",22670076,
                    "informatica",9.5);
            System.out.println(student1.soy());
            student1.toString();

            System.out.println("----------------------------------------------------------");

            System.out.println(teacher1.soy());
            teacher1.toString();


       /* System.out.println("\n los datos del alumno son:"+
               "\n" +student1.getName()+;
                "\n"+ student1.getLastname()+
                "\n"+ student1.getEmail()+
                "\n"+ student1.getAddress()+
                "\n"+ student1.getControlNumber()+
                "\n"+ student1.getCareer()+
                "\n"+ student1.getGeneralAverage());
        */

            //Probando la sobre carga de metdos

            // System.out.println("Metodo toSting() de Student:  " + student1.toString());
            //System.out.println("Metodo to String() de Teacher:  " + teacher1.toString());
        }


    }
