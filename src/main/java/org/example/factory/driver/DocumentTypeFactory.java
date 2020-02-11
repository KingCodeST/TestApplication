package org.example.factory.driver;


import org.example.domain.driver.DocumentType;
import org.example.util.GenerateID;

public class DocumentTypeFactory {

   public static DocumentType GenericBuild(String docType,String docname){

       return new DocumentType.Builder()

                              .setDocumentType(GenerateID.generateId())
                              .setName(docname)
                              .build();

   }




}
