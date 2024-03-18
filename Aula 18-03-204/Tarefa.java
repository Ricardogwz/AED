public class Tarefa {
    private String desc;
    private boolean status;

    public Tarefa(String desc, boolean status) {
        setDesc(desc);
        setStatus(status);
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean isStatus() {
        return status;
    }


    // Sempre iniciando com false , tarefa não concluída
    public void setStatus(boolean status) {
        this.status = false;
    }

    @Override
    public String toString() {
        return "Descrição da Tarefa =" + desc + ", Status=" + status;
    }

}
