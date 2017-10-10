
package arvorenarea;

import static arvorenarea.ArvoreNArea.N;

public class NArea {
    private No raiz;
    
    public NArea(No raiz) {
        this.raiz = raiz;
    }
    
    public void insere(int info) {
        int pos = 0;
        No ant = new No();
        boolean flag = false;
        
        if(raiz == null)
            raiz = new No(info);
        else {
            No p = raiz;
            while(p != null && !flag) {
                pos = p.busca(info);
                if(p.getTl() < N-1) { // tem espaço
                    p.remaneja(pos);
                    p.setvInfo(pos, info);
                    p.setTl(p.getTl()+1);
                    flag = true;
                } else { // não tem espaço
                    ant = p;
                    p = p.getvLig(pos);
                }
            }
            if(!flag) {
                ant.setvLig(pos, new No(info));
            }
        }
    }
    
    public No busca(int info) {
        return raiz;
    }
    
    public void in_ordem(No p) {
        if(p != null) {
            for(int i = 0; i < raiz.getTl(); i++) {
                in_ordem(p.getvLig(i));
                p.getvLig(i).exibeInfo();
            }
            in_ordem(p.getvLig(p.getTl()));
        }
    }

    public No getRaiz() {
        return raiz;
    }

    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }
}
