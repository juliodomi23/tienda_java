
package Tablet;

/**
 *
 * @author julio
 */
public class tablet {
    private int id;
    private String marca;
    private String serialNumber;
    private float precio;
    private Ram_Memory ram;
    private Rom_Memory rom;
    private Camera cam;
    private Processor processor;
    private Main_Controller controller;

    
public tablet(int Id,String Marca,String SNumber,float precio,Ram_Memory ram,Rom_Memory rom,Camera cam,Processor processor,Main_Controller controller){
    Id=id;
    Marca=marca;
    SNumber=serialNumber;
    precio=precio;
    ram=ram;
    rom=rom;
    cam = cam;
    processor=processor;
    controller=controller;
    }

}
