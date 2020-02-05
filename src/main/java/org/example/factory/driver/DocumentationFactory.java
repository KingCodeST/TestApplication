package org.example.factory.driver;

import org.example.domain.driver.Documentation;

public class DocumentationFactory {

    public static Documentation GenericBuild(String docId,String docname,String docType)
    {
        return new Documentation.Builder()
                                .setDocumentId(docId)
                                .setDocumentName(docname)
                                .setDocumentTypeId(docType)
                                .build();
    }

}
