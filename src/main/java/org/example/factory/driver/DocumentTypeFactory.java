package org.example.factory.driver;


import org.example.domain.driver.DocumentType;

public class DocumentTypeFactory {

   public static DocumentType GenericBuild(String docType,String docname){

       return new DocumentType.Builder()
                              .setDocumentType(docType)
                              .setName(docname)
                              .build();

   }




}
