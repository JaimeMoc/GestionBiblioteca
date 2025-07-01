package modules;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<MaterialBibliografico> materiales;

    public Biblioteca(){
        this.materiales = new ArrayList<>();
    }

    public void agregarMaterial(MaterialBibliografico material) {
        materiales.add(material);
        System.out.println("Material agregado: " + material.getNombre());
    }

    public void mostrarMateriales(){
        for (MaterialBibliografico material : materiales) {
            System.out.println("Material: " + material.getNombre() + "| ID: "+ material.getId() + "| Código: " + material.getCodigo());
        }
    }

    public MaterialBibliografico buscarPorNombre(String nombre){
        for (MaterialBibliografico material: materiales){
            if (material.getNombre().equalsIgnoreCase(nombre)){
                return material;
            }
        }
        return null;
    }

    public boolean eliminarPorId(int id){
        return materiales.removeIf(m -> m.getId() == id);
    }

    public int contarMateriales(){
        return materiales.size();
    }
}
