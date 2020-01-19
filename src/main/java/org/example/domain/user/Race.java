package org.example.domain.user;

import javax.persistence.*;

@Entity
public class Race {

    @Id
    private String raceId;
    private String studentNo;
    private String name;

    public Race(){}

    private Race(Builder builder){
        this.raceId =builder.raceId;
        this.studentNo=builder.studentNo;
        this.name=builder.name;

    }

    public String getRaceId() {
        return raceId;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Race{" +
                "raceId='" + raceId + '\'' +
                ", studentNo='" + studentNo + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static class Builder{

        private String raceId;
        private String studentNo;
        private String name;

        public Builder setRaceId(String raceId)
        {
            this.raceId =raceId;
            return this;
        }

        public Builder setStudentNo(String studentNo)
        {
            this.studentNo=studentNo;
            return this;
        }

        public Builder setName(String name)
        {
            this.name =name;
            return this;
        }

        public Builder copy(Race race)
        {
            this.raceId =race.raceId;
            this.name=race.name;
            this.studentNo=race.studentNo;
            return this;
        }

        public Race build()
        {
            return new Race(this);
        }



    }

}
