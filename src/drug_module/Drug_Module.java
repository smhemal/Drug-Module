
package drug_module;


public class Drug_Module {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vtm vt1 = new Vtm();
        vt1.name = "Ciprofloxacin";
        vt1.formula = "C17H18FN3O3";
        vt1.sideEffect = "Nausia";
        //System.out.println(vtm1.name+vtm1.formula+vtm1.sideEffect);
        
        Vtm vt2 = new Vtm();
        vt2.name = "Amoxicillin";
        vt2.formula = "C16H19N3O5S";
        vt2.sideEffect = "Vomiting";
       
        Vtm vt3 = new Vtm();
        vt3.name = "Nifidipine";
        vt3.formula = "C17H18N2O6";
        vt3.sideEffect = "Headache";
        
        Atm a1 = new Atm();
        a1.name = "Ciplox";
        a1.mName = "Cipla";
        a1.vtm = vt1;
        
        Atm a2 = new Atm();
        a2.name = "Amoxil";
        a2.mName = "GSK";
        a2.vtm = vt2;
        
        Atm a3 = new Atm();
        a3.name = "Nifin20";
        a3.mName = "HealthyLifePharma";
        a3.vtm = vt3;
        
        Vmp v1 = new Vmp();
        v1.vtm = vt1;
        v1.dosageForm = "Capsule";
        v1.strengh = 500.0;
        v1.strentgUnit = "mg";
        v1.name = "Ciprofloxacin 500mg Capsule";
        
        Vmp v2 = new Vmp();
        v2.vtm = vt2;
        v2.dosageForm = "Capsule";
        v2.strengh = 500.0;
        v2.strentgUnit = "mg";
        v2.name = "Amoxicillin 500mg Capsule";
        
        Vmp v3 = new Vmp();
        v3.vtm = vt1;
        v3.dosageForm = "Tablet";
        v3.strengh = 20.0;
        v3.strentgUnit = "mg";
        v3.name = "Nifedipine 20mg Tablet";
        
        Amp ap1 = new Amp();
        ap1.manuafacture = "Cipla";
        ap1.vmp = v1;
        ap1.name = "Ciplox";
        
        System.out.println(ap1.name + " contain " + ap1.vmp.vtm.name + " " + ap1.vmp.strengh + " " 
                + ap1.vmp.strentgUnit + " in term of a " + ap1.vmp.dosageForm + ".");
        
        
            }
    
}
