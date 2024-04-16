package ch04_pjt_03.scope;

public class DependencyBean {
    
    InjectionBean injectionBean;
    
    public DependencyBean(InjectionBean injectionBean) {
        
        this.injectionBean = injectionBean;
        
    }
}