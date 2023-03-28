import mijava.ratonera.Raton;

public class Main {
    public static void main(String[] args) {
        Raton mickey=new Raton();
        mickey.edad=1;
        mickey.peso=10;
        mickey.tasaCrecimiento=0.5;

        Raton ratatouille=new Raton();
        ratatouille.edad=1;
        ratatouille.peso=8;
        ratatouille.tasaCrecimiento=0.2;

        while(ratatouille.peso<= mickey.peso){
            System.out.printf("%s->%s   %s->%s\n","Ratatouille",ratatouille.datos(),"Mickey",mickey.datos());
            ratatouille.desarrollar();
            mickey.desarrollar();
            if(ratatouille.edad>=60) ratatouille.tasaCrecimiento=ratatouille.tasaCrecimiento+1;
        }
    }
}