
package arvorenarea;

import static arvorenarea.ArvoreNArea.N;

public class No {
    private int vInfo[] = new int[N];
    private No vLig[] = new No[N-1];
    int tl;
    
    public No(int info) {
        vInfo = new int[N];
        vLig = new No[N-1];
        tl = 1;
        vInfo[0] = info;
    }

    No() {
        
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
        int pos = 0;
        
        while(pos < tl && info < vInfo[pos])
            pos++;
        
        return pos;
    }
    
    public void remaneja(int pos) {
    
    }
    
    public void exibeInfo() {
        for(int i = 0; i < tl; i++)
            System.out.print(vInfo[i]);
        System.out.println("");
    }
}
