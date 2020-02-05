package org.example.domain.driver;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DocumentType {

    @Id
    private String documentTypeId;
    private String docTypeName;

    public DocumentType(){}

    private DocumentType(Builder builder)
    {
        this.documentTypeId =builder.documentTypeId;
        this.docTypeName=builder.docTypeName;
    }

    public String getDocumentTypeId() {
        return documentTypeId;
    }

    public String getdocTypeName() {
        return docTypeName;
    }

    @Override
    public String toString() {
        return "DocumentType{" +
                "documentTypeId='" + documentTypeId + '\'' +
                ", docTypeName='" + docTypeName + '\'' +
                '}';
    }

    public static class Builder{
        private String documentTypeId;
        private String docTypeName;
        
        public  Builder setDocumentType(String type)
        {
            this.documentTypeId =type;
            return this;
        }
        
        public Builder setName(String name)
        {
            this.docTypeName =name;
            return this;
        }

        public Builder copy(DocumentType doctype)
        {
            this.documentTypeId =doctype.documentTypeId;
            this.docTypeName =doctype.docTypeName;
            return this;
        }

        public DocumentType build()
        {
            return new DocumentType(this);
        }

    }

}
