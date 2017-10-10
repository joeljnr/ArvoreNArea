
package arvorenarea;

public class No {
    private int vInfo[];
    private No vLig[];
    int tl;
    
    public No(int info) {
    
    }

    public int[] getvInfo() {
        return vInfo;
    }

    public int getvInfo(int p) {
        return vInfo[p];
    }
    
    public void setvInfo(int[] vInfo) {
        this.vInfo = vInfo;
    }

    public void setvInfo(int p, int info) {
        this.vInfo[p] = info;
    }
    
    public No[] getvLig() {
        return vLig;
    }

    public void setvLig(No[] vLig) {
        this.vLig = vLig;
    }

    public No getvLig(int p) {
        return vLig[p];
    }

    public void setvLig(int p, No no) {
        this.vLig[p] = no;
    }
    
    public int getTl() {
        return tl;
    }

    public void setTl(int tl) {
        this.tl = tl;
    }

    public int busca(int info) {
        return 0;
    }
    
    public void remaneja(int pos) {
    
    }
}
