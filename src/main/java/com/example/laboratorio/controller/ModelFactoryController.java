package com.example.laboratorio.controller;

import com.example.laboratorio.services.ModelFactoryControllerService;
import com.example.laboratorio.services.impl.LaboratoryServiceImpl;

public class ModelFactoryController implements ModelFactoryControllerService {
    LaboratoryServiceImpl laboratory;
    private static class SingletonHolder {
        // El constructor de Singleton puede ser llamado desde aquí al ser protected
        private final static ModelFactoryController eINSTANCE = new ModelFactoryController();
    }

    // Método para obtener la instancia de nuestra clase
    public static ModelFactoryController getInstance() {
        return SingletonHolder.eINSTANCE;
    }

    public ModelFactoryController() {
        System.out.println("invocación clase singleton");
        laboratory = new LaboratoryServiceImpl();
    }

}
