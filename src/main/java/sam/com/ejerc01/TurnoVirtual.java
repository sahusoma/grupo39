public class TurnoVirtual {
    //ESTA CLASE NO TIENE MAIN
 
   
    //INSERTE LOS ATRIBUTOS
    private String [] turnos;
    private String[] turnosPerdidos;
    private Boolean estadoTurnoVirtual ;
    private int turnoEnAtencion;
    private int cantidadTurnosAtendidos;
   
    //INSERTE EL MÉTODO CONSTRUCTOR
    public TurnoVirtual(String[] turnos) {
        this.turnos = new String[turnos.length];
        this.turnosPerdidos = new String[turnos.length];
        estadoTurnoVirtual = true;
        turnoEnAtencion = 0;
        cantidadTurnosAtendidos = 1;
       
        for (int i = 0; i <turnos.length; i++){
        this.turnosPerdidos[i]=" ";
        }
        for (int i = 0; i <turnos.length; i++){
        this.turnos[i]=turnos[i];
        }
       // System.out.println(turnosPerdidos);
    }
   
   
    //INSERTE LOS GETTERS Y SETTERS
   
     public String[] getTurnos() {
        return turnos;
    }

    public void setTurnos(String[] turnos) {
        this.turnos = turnos;
    }

    public String[] getTurnosPerdidos() {
        return turnosPerdidos;
    }

    public void setTurnosPerdidos(String[] turnosPerdidos) {
        this.turnosPerdidos = turnosPerdidos;
    }

    public Boolean isEstadoTurnoVirtual() {
        return estadoTurnoVirtual;
    }

    public void setEstadoTurnoVirtual(Boolean estadoTurnoVirtual) {
        this.estadoTurnoVirtual = estadoTurnoVirtual;
    }

    public int getTurnoEnAtencion() {
        return turnoEnAtencion;
    }

    public void setTurnoEnAtencion(int turnoEnAtencion) {
        this.turnoEnAtencion = turnoEnAtencion;
    }

    public int getCantidadTurnosAtendidos() {
        return cantidadTurnosAtendidos;
    }

    public void setCantidadTurnosAtendidos(int cantidadTurnosAtendidos) {
        this.cantidadTurnosAtendidos = cantidadTurnosAtendidos;
    }
   
    //INSERTE LOS DEMÁS MÉTODOS
      public void atenderProximoTurno  (){
        if (estadoTurnoVirtual==true){
            turnoEnAtencion=(turnoEnAtencion +1)%turnos.length;
            cantidadTurnosAtendidos+=1;}
    }

    public void cambiarEstadoTurno (){
          if (estadoTurnoVirtual==true){
              estadoTurnoVirtual = false;
          }else{
              estadoTurnoVirtual = true;
    }
    }
    //NO SE DEBE PREOCUPAR POR DESARROLLAR ESTE MÉTODO. ¡NO ELIMINARLO NI MODIFICARLO!
    public void agregarTurnoPerdido() {
        for (int i = 0; i < turnosPerdidos.length; i++) {
            if (" ".equals(turnosPerdidos[i])) {
                turnosPerdidos[i] = turnos[turnoEnAtencion];
                break;
            }
        }
    }  
}