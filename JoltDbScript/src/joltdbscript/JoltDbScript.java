
package JoltDbScript;

import java.sql.*;

public class JoltDbScript {

  public static void main(String[] args) {
    dropTables();
    System.out.println("==================================");
    createTables();
    System.out.println("==================================");
    populateTables();
    System.out.println("==================================");
    System.out.println("Finished setting up Jolt Database.");
  }

public static void populateTables(){
try{
        String driver = "org.apache.derby.jdbc.ClientDriver";
        Class.forName(driver);
        System.out.println("Loaded Driver: " + driver);

        // Establish Connection
        String url = "jdbc:derby://localhost:1527/JoltDB";
        String username = "app";
        String password = "app";
        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("Connected to: " + url);

        //Populate user table
        String query = "INSERT INTO USERS (USER_EMAIL, USER_PASSWORD, USER_TYPE) VALUES ('user1@gmail.com', 'qq7IxuuTacoQz4c6LbnpJA==', 1)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.executeUpdate();

        query = "INSERT INTO USERS (USER_EMAIL, USER_PASSWORD, USER_TYPE) VALUES ('user2@gmail.com', '5TZXsMwLtnqX4Wi26EUQxA==', 1)";
        ps = con.prepareStatement(query);
        ps.executeUpdate();

        query = "INSERT INTO USERS (USER_EMAIL, USER_PASSWORD, USER_TYPE) VALUES ('user3@gmail.com', '/c557ruBGk+6R7019fDpOw==', 1)";
        ps = con.prepareStatement(query);
        ps.executeUpdate();

        query = "INSERT INTO USERS (USER_EMAIL, USER_PASSWORD, USER_TYPE) VALUES ('employer1@gmail.com', '8uBKYajOx4R+gcGkK8Guhw==', 2)";
        ps = con.prepareStatement(query);
        ps.executeUpdate();

        query = "INSERT INTO USERS (USER_EMAIL, USER_PASSWORD, USER_TYPE) VALUES ('employer2@gmail.com', 'oShkzobB4eDEaoMaDlbwQg==', 2)";
        ps = con.prepareStatement(query);
        ps.executeUpdate();

        query = "INSERT INTO USERS (USER_EMAIL, USER_PASSWORD, USER_TYPE) VALUES ('employer3@gmail.com', '2oPIAgYM8ngwSH1YsM4Y5Q==', 2)";
        ps = con.prepareStatement(query);
        ps.executeUpdate();

        //Populate Industries Table
        query = "INSERT INTO INDUSTRIES (IND_NAME) VALUES ('Information Technology')";
        ps = con.prepareStatement(query);
        ps.executeUpdate();

        query = "INSERT INTO INDUSTRIES (IND_NAME) VALUES ('Healthcare')";
        ps = con.prepareStatement(query);
        ps.executeUpdate();

        query = "INSERT INTO INDUSTRIES (IND_NAME) VALUES ('Sales')";
        ps = con.prepareStatement(query);
        ps.executeUpdate();

        query = "INSERT INTO INDUSTRIES (IND_NAME) VALUES ('Education')";
        ps = con.prepareStatement(query);
        ps.executeUpdate();

        query = "INSERT INTO INDUSTRIES (IND_NAME) VALUES ('Finance')";
        ps = con.prepareStatement(query);
        ps.executeUpdate();

        query = "INSERT INTO INDUSTRIES (IND_NAME) VALUES ('Marketing')";
        ps = con.prepareStatement(query);
        ps.executeUpdate();

        query = "INSERT INTO INDUSTRIES (IND_NAME) VALUES ('Engineering')";
        ps = con.prepareStatement(query);
        ps.executeUpdate();

        query = "INSERT INTO INDUSTRIES (IND_NAME) VALUES ('Hospitality')";
        ps = con.prepareStatement(query);
        ps.executeUpdate();

        //Populate application status Table
        query = "INSERT INTO STATUSES (STATUS_NAME) VALUES ('Pending')";
        ps = con.prepareStatement(query);
        ps.executeUpdate();

        query = "INSERT INTO STATUSES (STATUS_NAME) VALUES ('Accepted')";
        ps = con.prepareStatement(query);
        ps.executeUpdate();

        query = "INSERT INTO STATUSES (STATUS_NAME) VALUES ('Rejected')";
        ps = con.prepareStatement(query);
        ps.executeUpdate();

        //Populate job types table
        query = "INSERT INTO TYPES (TYPE_NAME) VALUES ('Fresh Grad')";
        ps = con.prepareStatement(query);
        ps.executeUpdate();

        query = "INSERT INTO TYPES (TYPE_NAME) VALUES ('Contractual')";
        ps = con.prepareStatement(query);
        ps.executeUpdate();

        query = "INSERT INTO TYPES (TYPE_NAME) VALUES ('Internship')";
        ps = con.prepareStatement(query);
        ps.executeUpdate();

        query = "INSERT INTO TYPES (TYPE_NAME) VALUES ('Part-Time')";
        ps = con.prepareStatement(query);
        ps.executeUpdate();

        query = "INSERT INTO TYPES (TYPE_NAME) VALUES ('Full-Time')";
        ps = con.prepareStatement(query);
        ps.executeUpdate();

        //Populate Job level table
        query = "INSERT INTO LEVELS (LEVEL_NAME) VALUES ('Entry-Level')";
        ps = con.prepareStatement(query);
        ps.executeUpdate();

        query = "INSERT INTO LEVELS (LEVEL_NAME) VALUES ('Intermediate')";
        ps = con.prepareStatement(query);
        ps.executeUpdate();

        query = "INSERT INTO LEVELS (LEVEL_NAME) VALUES ('Mid-Level')";
        ps = con.prepareStatement(query);
        ps.executeUpdate();

        query = "INSERT INTO LEVELS (LEVEL_NAME) VALUES ('Senior-Level')";
        ps = con.prepareStatement(query);
        ps.executeUpdate();

        query = "INSERT INTO LEVELS (LEVEL_NAME) VALUES ('Executive-Level')";
        ps = con.prepareStatement(query);
        ps.executeUpdate();

        //Populate Employers Table
        query = "INSERT INTO EMPLOYERS (USER_ID, EMP_NAME, EMP_OVERVIEW, EMP_ADDRESS, EMP_NUMBER)    VALUES (4, 'Google','Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum',             'Pasay City', '12345678912')";
        ps = con.prepareStatement(query);
        ps.executeUpdate();

        query = "INSERT INTO EMPLOYERS (USER_ID, EMP_NAME, EMP_OVERVIEW, EMP_ADDRESS, EMP_NUMBER)    VALUES (5, 'CityLand','Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum',            'Quezon City', '12345678912')";
        ps = con.prepareStatement(query);
        ps.executeUpdate();

        query = "INSERT INTO EMPLOYERS (USER_ID, EMP_NAME, EMP_OVERVIEW, EMP_ADDRESS, EMP_NUMBER)    VALUES (6, 'Manulife','Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum',            'Manila', '12345678912')";
        ps = con.prepareStatement(query);
        ps.executeUpdate();

        //Populate jobs table
        query = "INSERT INTO JOBS (EMP_ID, JOB_TITLE, JOB_LOCATION, JOB_LEVEL,        JOB_DESC, JOB_RESP, JOB_REQS, JOB_BENEFIT, INDUSTRY_ID,        JOB_SALARY_MIN, JOB_SALARY_MAX, JOB_TYPE) VALUES (        1,'Junior Web Developer', 'Manila', 0,         'We are looking for a highly skilled and experienced Web Developer with a strong focus on technical SEO, page speed optimization, and ad pixel implementation. The ideal candidate will be responsible for revamping our website, optimizing user engagement, and enhancing conversion rates through their deep technical expertise.',        'Estimate workload and project delivery timeline.*Writing clean, high-quality, high-performance, maintainable code.*Develop applications in Vue.js.',        'Fluent English communication skills are a must.*Experience in consuming and integrating restful APIs in a Single Page JS application*.Sc/B.Sc in Computer Science, Engineering or relevant fields is an advantage but not required',        'Opportunities for promotion*Pay Raise*Promotion to Permanent Employee',        1, '22000', '25000', 0)";
        ps = con.prepareStatement(query);
        ps.executeUpdate();

        query = "INSERT INTO JOBS (EMP_ID, JOB_TITLE, JOB_LOCATION, JOB_LEVEL,        JOB_DESC, JOB_RESP, JOB_REQS, JOB_BENEFIT, INDUSTRY_ID,        JOB_SALARY_MIN, JOB_SALARY_MAX, JOB_TYPE) VALUES (        2,'Project Engineer', 'Manila', 3,        'As a Teller, you will handle administrative, operations, marketing and financial experience by supporting the branch business. When it comes to career growth, it is an opportunity to get valuable corporate experience while learning from seasoned veterans of a highly competitive field.',        'Collaborate with the Senior Engineers to create more efficient methods and maintain profitability*Develop the specifications for all equipment that is required for each project*Create the framework used to develop and monitor project metrics and manage the collection of project data',        'Licensed Civil Engineer*At least 3 Years experience',        'Opportunities for promotion*Pay Raise*Promotion to Permanent Employee',        7, '21000', '24000', 4)";
        ps = con.prepareStatement(query);
        ps.executeUpdate();

        query = "INSERT INTO JOBS (EMP_ID, JOB_TITLE, JOB_LOCATION, JOB_LEVEL,        JOB_DESC, JOB_RESP, JOB_REQS, JOB_BENEFIT, INDUSTRY_ID,        JOB_SALARY_MIN, JOB_SALARY_MAX, JOB_TYPE) VALUES (        3,'Financial Analyst', 'Manila', 2,         'The position is accountable for providing accurate, timely, and relevant monthly, quarterly and annual financial data production, reporting, analysis, planning and forecasting to different stakeholders of the Global Wealth and Asset Management & General Account (GWAM & GA) Finance Financial Planning & Analysis – Asia team.',        'Actively involved with consolidating, analyzing, and synthesizing large amount of financial and non-financial information from various stakeholders*Initiates improvements by exploring, identifying, and implementing reporting, analysis, and process solutions',        'Degree in BS Accountancy, preferably with Professional CPA license but not required*Knowledge of General Accounting principles*With 2-3 years of experience in the same field',        'Opportunities for promotion*Pay Raise*Promotion to Permanent Employee',        5, '20000', '23000', 3)";
        ps = con.prepareStatement(query);
        ps.executeUpdate();

        //Populate jobseekers table
        query = "INSERT INTO JOBSEEKERS(    USER_ID, SEEKER_FNAME, SEEKER_LNAME, SEEKER_TITLE,    SEEKER_ABOUT,    SEEKER_EDUC_COURSE, SEEKER_EDUC_SCHOOL, SEEKER_EDUC_BATCH,    SEEKER_EXP_TITLE, SEEKER_EXP_COMPANY, SEEKER_EXP_BATCH,    SEEKER_SKILLS,    SEEKER_ADDRESS, SEEKER_NUMBER, SEEKER_ZOOMID) VALUES (    1, 'JR Gregg', 'Lagman', 'Web Developer',    'Experienced web developer with a strong background in front-end development and expertise in HTML, CSS, and JavaScript. Skilled in developing responsive and user-friendly websites and applications using modern frameworks such as React and Angular. Passionate about staying up-to-date with the latest web technologies and trends. A collaborative team player with excellent communication skills and a focus on delivering high-quality work.',    'University of Santo Tomas', 'B.S. Computer Science', '2018 - 2022',    'Web Developer Intern', 'Canva',' 2022 - Present',    'Strong Problem Solving and analytical Skills*Excellent communication and collaboration skills*Experience working in Agile Environments',    'Quezon City', '1234567890', 'jrgregglagman')";
        ps = con.prepareStatement(query);
        ps.executeUpdate();

        query = "INSERT INTO JOBSEEKERS(    USER_ID, SEEKER_FNAME, SEEKER_LNAME, SEEKER_TITLE,    SEEKER_ABOUT,    SEEKER_EDUC_COURSE, SEEKER_EDUC_SCHOOL, SEEKER_EDUC_BATCH,    SEEKER_EXP_TITLE, SEEKER_EXP_COMPANY, SEEKER_EXP_BATCH,    SEEKER_SKILLS,    SEEKER_ADDRESS, SEEKER_NUMBER, SEEKER_ZOOMID) VALUES (    2, 'Lancelot', 'Bulan', 'Civil Engineer',    'Dynamic civil engineer with experience in infrastructure design, construction and project management. Skilled in AutoCAD, SAP2000 and MS Project. Strong analytical and problem-solving abilities with a focus on ensuring projects are completed on time and within budget. Proven ability to work in a team and to communicate effectively with clients and stakeholders.',    'University of Santo Tomas', 'B.S. Civil Engineering', '2018 - 2022',    'Project Engineer', 'Ayala', '2022 - Present',    'Strong Problem Solving and analytical Skills*Excellent communication and collaboration skills*Experience working in Agile Environments',    'Quezon City', '1234567890', 'lancelotbulan')";
        ps = con.prepareStatement(query);
        ps.executeUpdate();

        query = "INSERT INTO JOBSEEKERS(    USER_ID, SEEKER_FNAME, SEEKER_LNAME, SEEKER_TITLE,    SEEKER_ABOUT,    SEEKER_EDUC_COURSE, SEEKER_EDUC_SCHOOL, SEEKER_EDUC_BATCH,    SEEKER_EXP_TITLE, SEEKER_EXP_COMPANY, SEEKER_EXP_BATCH,    SEEKER_SKILLS,    SEEKER_ADDRESS, SEEKER_NUMBER, SEEKER_ZOOMID) VALUES (    3, 'Jay', 'Ambal', 'Financial Analyst',    'Experienced financial analyst with expertise in financial modeling and analysis, forecasting, and budgeting. Skilled in Excel, Bloomberg Terminal, and other financial software. Strong analytical and problem-solving abilities with a focus on delivering accurate and actionable insights to support investment decisions. Proven ability to work independently and as part of a team.',    'University of Santo Tomas', 'B.S. Accountancy', '2018 - 2022',    'Finance Intern', 'Some Company', '2022 - Present',    'Strong Problem Solving and analytical Skills*Excellent communication and collaboration skills*Experience working in Agile Environments',    'Quezon City', '1234567890', 'jayambal')";
        ps = con.prepareStatement(query);
        ps.executeUpdate();

        System.out.println("Successfully populated.");
        ps.close();
        con.close();
}catch (SQLException | ClassNotFoundException sqle) {
            sqle.printStackTrace();
    }
}

public static void dropTables(){
try{
        String driver = "org.apache.derby.jdbc.ClientDriver";
        Class.forName(driver);
        System.out.println("Loaded Driver: " + driver);

        // Establish Connection
        String url = "jdbc:derby://localhost:1527/JoltDB";
        String username = "app";
        String password = "app";
        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("Connected to: " + url);

        String query = "DROP TABLE APPLICATIONS";
        PreparedStatement ps = con.prepareStatement(query);
        ps.executeUpdate();
        System.out.println("Dropped Applications Table");


        query = "DROP TABLE JOBS";
        ps = con.prepareStatement(query);
        ps.executeUpdate();
        System.out.println("Dropped JOBS Table");


        query = "DROP TABLE JOBSEEKERS";
        ps = con.prepareStatement(query);
        ps.executeUpdate();
        System.out.println("Dropped JOBSEEKERS Table");


        query = "DROP TABLE EMPLOYERS";
        ps = con.prepareStatement(query);
        ps.executeUpdate();
        System.out.println("Dropped EMPLOYERS Table");


        query = "DROP TABLE INDUSTRIES";
        ps = con.prepareStatement(query);
        ps.executeUpdate();
        System.out.println("Dropped INDUSTRIES Table");


        query = "DROP TABLE USERS";
        ps = con.prepareStatement(query);
        ps.executeUpdate();
        System.out.println("Dropped USERS Table");


        query = "DROP TABLE STATUSES";
        ps = con.prepareStatement(query);
        ps.executeUpdate();
        System.out.println("Dropped STATUSES Table");


        query = "DROP TABLE TYPES";
        ps = con.prepareStatement(query);
        ps.executeUpdate();
        System.out.println("Dropped TYPES Table");


        query = "DROP TABLE LEVELS";
        ps = con.prepareStatement(query);
        ps.executeUpdate();
        System.out.println("Dropped LEVELS Table");

        ps.close();
        con.close();
}catch (SQLException | ClassNotFoundException sqle) {
      System.out.println("Aborted Dropping tables as they do not exist yet.");
    }
}

public static void createTables(){
    try {
        // Load Driver
        String driver = "org.apache.derby.jdbc.ClientDriver";
        Class.forName(driver);
        System.out.println("Loaded Driver: " + driver);

        // Establish Connection
        String url = "jdbc:derby://localhost:1527/JoltDB";
        String username = "app";
        String password = "app";
        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("Connected to: " + url);

        String query = "CREATE TABLE USERS("
                    + "USER_ID INTEGER PRIMARY KEY GENERATED ALWAYS AS IDENTITY(Start with 1, Increment by 1),    "
                    + "USER_EMAIL VARCHAR(50) UNIQUE,    USER_PASSWORD VARCHAR(50),    "
                    + "USER_TYPE INT)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.executeUpdate();
        System.out.println("Created Users Table");


        query = "CREATE TABLE INDUSTRIES(    "
                    + "IND_ID INTEGER PRIMARY KEY GENERATED ALWAYS AS IDENTITY(Start with 1, Increment by 1),    "
                    + "IND_NAME VARCHAR(100))";
        ps = con.prepareStatement(query);
        ps.executeUpdate();
        System.out.println("Created Industries Table");


        query = "CREATE TABLE STATUSES(    "
                    + "STATUS_ID INTEGER PRIMARY KEY GENERATED ALWAYS AS IDENTITY(Start with 0, Increment by 1),    "
                    + "STATUS_NAME VARCHAR(100))";
        ps = con.prepareStatement(query);
        ps.executeUpdate();
        System.out.println("Created Statuses Table");


        query = "CREATE TABLE TYPES(    TYPE_ID INTEGER PRIMARY KEY GENERATED ALWAYS AS IDENTITY(Start with 0, Increment by 1),    "
        + "TYPE_NAME VARCHAR(100))";
        ps = con.prepareStatement(query);
        ps.executeUpdate();
        System.out.println("Created Job Types Table");


        query = "CREATE TABLE LEVELS(    LEVEL_ID INTEGER PRIMARY KEY GENERATED ALWAYS AS IDENTITY(Start with 0, Increment by 1),    "
        + "LEVEL_NAME VARCHAR(100))";
        ps = con.prepareStatement(query);
        ps.executeUpdate();
        System.out.println("Created Job levels Table");


        query = "CREATE TABLE EMPLOYERS(    EMP_ID INTEGER PRIMARY KEY GENERATED ALWAYS AS IDENTITY(Start with 1, Increment by 1),    "
         + "USER_ID INTEGER references USERS(USER_ID) ON DELETE CASCADE,    "
         + "EMP_NAME VARCHAR(50),    "
         + "EMP_OVERVIEW VARCHAR(2000),    "
         + "EMP_ADDRESS VARCHAR(100),    "
         + "EMP_NUMBER VARCHAR(50))";
        ps = con.prepareStatement(query);
        ps.executeUpdate();
        System.out.println("Created Employers Table");


        query = "CREATE TABLE JOBSEEKERS(    SEEKER_ID INTEGER PRIMARY KEY GENERATED ALWAYS AS IDENTITY(Start with 1, Increment by 1),    "
        + "USER_ID INTEGER references USERS(USER_ID) ON DELETE CASCADE,    "
        + "SEEKER_FNAME VARCHAR(50),    "
        + "SEEKER_LNAME VARCHAR(50),    "
        + "SEEKER_TITLE VARCHAR(50),    "
        + "SEEKER_ABOUT VARCHAR(2000),    "
        + "SEEKER_EDUC_COURSE VARCHAR(100),    "
        + "SEEKER_EDUC_SCHOOL VARCHAR(50),    "
        + "SEEKER_EDUC_BATCH VARCHAR(50),    "
        + "SEEKER_EXP_TITLE VARCHAR(50),    "
        + "SEEKER_EXP_COMPANY VARCHAR(100),    "
        + "SEEKER_EXP_BATCH VARCHAR(50),    "
        + "SEEKER_SKILLS VARCHAR(2000),    "
        + "SEEKER_ADDRESS VARCHAR(50),    "
        + "SEEKER_NUMBER VARCHAR(50),    "
        + "SEEKER_ZOOMID VARCHAR(50))";
        ps = con.prepareStatement(query);
        ps.executeUpdate();
        System.out.println("Created Job Seekers Table");


        query = "CREATE TABLE JOBS(    JOB_ID INTEGER PRIMARY KEY GENERATED ALWAYS AS IDENTITY(Start with 1, Increment by 1),    "
        + "EMP_ID INTEGER references EMPLOYERS(EMP_ID) ON DELETE CASCADE,    "
        + "JOB_TITLE VARCHAR(50),    "
        + "JOB_LOCATION VARCHAR(100),    "
        + "JOB_LEVEL INTEGER references LEVELS(LEVEL_ID),    "
        + "JOB_DESC VARCHAR(2000),    "
        + "JOB_RESP VARCHAR(2000),    "
        + "JOB_REQS VARCHAR(2000),    "
        + "JOB_BENEFIT VARCHAR(2000),   "
        + "INDUSTRY_ID INTEGER references INDUSTRIES(IND_ID),    "
        + "JOB_SALARY_MIN VARCHAR(50),        "
        + "JOB_SALARY_MAX VARCHAR(50),    "
        + "JOB_TYPE INTEGER references TYPES(TYPE_ID),    "
        + "JOB_ISACTIVE INT DEFAULT 0)";
        ps = con.prepareStatement(query);
        ps.executeUpdate();
        System.out.println("Created Jobs Table");


        query = "CREATE TABLE APPLICATIONS(    APP_ID INTEGER PRIMARY KEY GENERATED ALWAYS AS IDENTITY(Start with 1, Increment by 1),    "
         + "SEEKER_ID INTEGER REFERENCES JOBSEEKERS(SEEKER_ID) ON DELETE CASCADE,    "
         + "EMPLOYER_ID INTEGER REFERENCES EMPLOYERS(EMP_ID) ON DELETE CASCADE,    "
         + "JOB_ID INTEGER REFERENCES JOBS(JOB_ID) ON DELETE CASCADE,    "
         + "APP_STATUS INT DEFAULT 0)";
        ps = con.prepareStatement(query);
        ps.executeUpdate();
        System.out.println("Created job applications Table");

        ps.close();
        con.close();
    } catch (SQLException | ClassNotFoundException sqle) {
      sqle.printStackTrace();
    }
}

}
