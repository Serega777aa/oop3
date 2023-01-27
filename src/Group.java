public class Group extends Departament{
    public Group(String GropName){
        setDeptName(GropName);
    }

    public void addPeople(Persona persona){
        personaInDept.add(persona);
    }

    public void removePeople(Persona persona){
        personaInDept.remove(persona);
    }
    @Override
    public String toString() {
        return String.format("%s", deptName);
    }
}

