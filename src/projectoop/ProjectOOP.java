package projectoop;

public class ProjectOOP {

    public static void main(String[] args) {
//-------------------------Start of Variable Declaration.-------------------------------------------------------------------------------------------------------------------------------------
        College FacultyOfScience = new College("20221000000", "FacultyOfScience");
        Departments CS = new Departments("CS");
        Departments Stat = new Departments("Stat");
        Staduim S3 = new Staduim("Modrg 3", 200);
        Lab A = new Lab("Lab A", 50);
        Lecturer drShaimaa = new Lecturer("dr.Shaimaa", "20144", CS);
        Courses CS201 = new Courses("CS201", "OOP", 2, CS, drShaimaa);
        Student Mark = new Student("Mark Melad Thabt", "20221445736", CS);
        Student Henawy = new Student("Mohamad Ahmad Raaft", "20221445646", CS);
        Student Login = new Student("Login Ahmad Mohamad", "20221377255", CS);
        Student Laila = new Student("Laila Mohamad Mahmoud", "20221465108", CS);
        Travel Italy = new Travel("Italy", 500,"it's a trip to italy");
        Travel Turkey = new Travel("Turkey", 50000, "it's a trip to turkey");
        Travel Spain = new Travel("Spain", 2000, "it's a trip to Spain");
        Project Semicolon = new Project("SemiColon;", Henawy);
        Exam CS201Exam = new Exam("Mid Term of OOP", "15/11/2022", drShaimaa, CS201);
        Accountant AmLotfy = new Accountant("Lotfy", "1515151");
        Employees afaf = new Employees("Madam 3afaf dor el rab3", "5757575");
        Employees etmad = new Employees("Abla E3tmad  dor el talt", "4848484");
//-----------------------End of Variable Declaration.-----------------------------------------------------------------------------------------------------------------------------------------

//-----------------------Assigning Courses to Students.---------------------------------------------------------------------------------------------------------------------------------------
        CS201.Addstd(Mark);
        CS201.Addstd(Henawy);
        CS201.Addstd(Login);
        CS201.Addstd(Laila);

//-----------------------Assigning Projects to Students.--------------------------------------------------------------------------------------------------------------------------------------
        Semicolon.Addstd(Henawy);

//-----------------------Assigning Trips to Students.-----------------------------------------------------------------------------------------------------------------------------------------
        Italy.AddStudent(Henawy);
        Italy.AddStudent(Mark);
        Turkey.AddStudent(Login);
        Spain.AddStudent(Laila);

//-----------------------Students Paying Fees.------------------------------------------------------------------------------------------------------------------------------------------------
        AmLotfy.PayFee(Login);
        AmLotfy.PayFee(Mark);
        AmLotfy.PayFee(Henawy);
        AmLotfy.PayFee(Laila);
        
//-----------------------Employees Changing Salary.------------------------------------------------------------------------------------------------------------------------------------------------
        AmLotfy.SetSalary(AmLotfy,70000);

/*---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
                         Printing All Informations:
***********************  1.        College 
***********************  2.      Departments 
***********************  3.     Staduim & Labs 
***********************  4.    Trips & Projects 
***********************  5.     All Lecturers 
***********************  6.      All Courses 
***********************  7.        Students 
***********************  8.         Exams 
***********************  9.       Employees */
        System.out.println(
                FacultyOfScience + "\n\n" + CS + "\n\n" + Stat + "\n\n" + S3
                + "\n\n" + A + "\n\n" + Italy + "\n\n" + Semicolon + "\n\n"
                + drShaimaa + "\n\n" + CS201 + "\n\n" + Mark + "\n\n" + Henawy
                + "\n\n" + Login + "\n\n" + Laila + "\n\n" + CS201Exam
                + "\n\n" + AmLotfy + "\n\n" + afaf + "\n\n" + etmad
        );

    }

}
