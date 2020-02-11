package org.example.factory.driver;

import org.example.domain.driver.Documentation;
import org.example.util.GenerateID;

public class DocumentationFactory {

    public static Documentation GenericBuild(String docId,String docname,String docType)
    {
        return new Documentation.Builder()
                                .setDocumentId(GenerateID.generateId())
                                .setDocumentName(docname)
                                .setDocumentTypeId(docType)
                                .build();
    }

}
