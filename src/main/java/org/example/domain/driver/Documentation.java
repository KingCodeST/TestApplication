package org.example.domain.driver;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Documentation {

    @Id
    private String documentId;
    private String documentName;
    private String documentTypeId;

    public Documentation (){}

    private Documentation(Builder builder)
    {
        this.documentId =builder.documentId;
        this.documentName =builder.documentName;
        this.documentTypeId =builder.documentTypeId;
    }

    public String getDocumentId() {
        return documentId;
    }

    public String getDocumentName() {
        return documentName;
    }

    public String getDocumentTypeId() {
        return documentTypeId;
    }

    @Override
    public String toString() {
        return "Documentation{" +
                "documentId='" + documentId + '\'' +
                ", documentName='" + documentName + '\'' +
                ", documentTypeId='" + documentTypeId + '\'' +
                '}';
    }

    public static class Builder{

        private String documentId;
        private String documentName;
        private String documentTypeId;

        public Builder setDocumentId(String documentid)
        {
            this.documentId=documentid;
            return this;
        }

        public Builder setDocumentName(String docName)
        {
            this.documentName =docName;
            return this;
        }

        public Builder setDocumentTypeId(String docType)
        {
            this.documentTypeId =docType;
            return this;
        }

        public Builder copy(Documentation documentation)
        {
            this.documentId =documentation.documentId;
            this.documentName =documentation.documentName;
            this.documentTypeId=documentation.documentTypeId;
            return this;
        }

        public Documentation build()
        {
            return new Documentation(this);
        }

    }

}
