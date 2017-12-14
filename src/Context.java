/**
 * Created by X-MART on 30-Apr-17.
 */
public class Context {
    protected Strategie strategie;

    public Context() {
        strategie = new StrategieImp1();
    }

    public void setStrategie(Strategie strategie) {
        this.strategie = strategie;
    }

    public void appliquerStrategie(){
        strategie.traitement();
    }
}
