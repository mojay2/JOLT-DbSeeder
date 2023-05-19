package JoltDbScript;

import java.sql.*;
import model.Security;

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

  public static void populateTables() {
    try {
      String driver = "org.apache.derby.jdbc.ClientDriver";
      Class.forName(driver);
      System.out.println("Loaded Driver: " + driver);

      // Establish Connection
      String url = "jdbc:derby://localhost:1527/JoltDB";
      String username = "app";
      String password = "app";
      Connection con = DriverManager.getConnection(url, username, password);
      System.out.println("Connected to: " + url);

      // Ciphers
      String keyString = "ics_2609ics_2609";
      String cipherType = "AES/ECB/PKCS5Padding";

      //<editor-fold defaultstate="collapsed" desc="Populate user table">
      String query = "INSERT INTO USERS (USER_EMAIL, USER_PASSWORD, USER_TYPE) VALUES ('user1@gmail.com', ?, 1)";
      PreparedStatement ps = con.prepareStatement(query);
      ps.setString(1, Security.encrypt("user1", cipherType, keyString));
      ps.executeUpdate();

      query = "INSERT INTO USERS (USER_EMAIL, USER_PASSWORD, USER_TYPE) VALUES ('user2@gmail.com', ?, 1)";
      ps = con.prepareStatement(query);
      ps.setString(1, Security.encrypt("user2", cipherType, keyString));
      ps.executeUpdate();

      query = "INSERT INTO USERS (USER_EMAIL, USER_PASSWORD, USER_TYPE) VALUES ('user3@gmail.com', ?, 1)";
      ps = con.prepareStatement(query);
      ps.setString(1, Security.encrypt("user3", cipherType, keyString));
      ps.executeUpdate();

      query = "INSERT INTO USERS (USER_EMAIL, USER_PASSWORD, USER_TYPE) VALUES ('user4@gmail.com', ?, 1)";
      ps = con.prepareStatement(query);
      ps.setString(1, Security.encrypt("user4", cipherType, keyString));
      ps.executeUpdate();

      query = "INSERT INTO USERS (USER_EMAIL, USER_PASSWORD, USER_TYPE) VALUES ('user5@gmail.com', ?, 1)";
      ps = con.prepareStatement(query);
      ps.setString(1, Security.encrypt("user5", cipherType, keyString));
      ps.executeUpdate();

      query = "INSERT INTO USERS (USER_EMAIL, USER_PASSWORD, USER_TYPE) VALUES ('user6@gmail.com', ?, 1)";
      ps = con.prepareStatement(query);
      ps.setString(1, Security.encrypt("user6", cipherType, keyString));
      ps.executeUpdate();

      query = "INSERT INTO USERS (USER_EMAIL, USER_PASSWORD, USER_TYPE) VALUES ('employer1@gmail.com', ?, 2)";
      ps = con.prepareStatement(query);
      ps.setString(1, Security.encrypt("employer1", cipherType, keyString));
      ps.executeUpdate();

      query = "INSERT INTO USERS (USER_EMAIL, USER_PASSWORD, USER_TYPE) VALUES ('employer2@gmail.com', ?, 2)";
      ps = con.prepareStatement(query);
      ps.setString(1, Security.encrypt("employer2", cipherType, keyString));
      ps.executeUpdate();

      query = "INSERT INTO USERS (USER_EMAIL, USER_PASSWORD, USER_TYPE) VALUES ('employer3@gmail.com', ?, 2)";
      ps = con.prepareStatement(query);
      ps.setString(1, Security.encrypt("employer3", cipherType, keyString));
      ps.executeUpdate();

      query = "INSERT INTO USERS (USER_EMAIL, USER_PASSWORD, USER_TYPE) VALUES ('employer4@gmail.com', ?, 2)";
      ps = con.prepareStatement(query);
      ps.setString(1, Security.encrypt("employer4", cipherType, keyString));
      ps.executeUpdate();

      query = "INSERT INTO USERS (USER_EMAIL, USER_PASSWORD, USER_TYPE) VALUES ('employer5@gmail.com', ?, 2)";
      ps = con.prepareStatement(query);
      ps.setString(1, Security.encrypt("employer5", cipherType, keyString));
      ps.executeUpdate();

      query = "INSERT INTO USERS (USER_EMAIL, USER_PASSWORD, USER_TYPE) VALUES ('employer6@gmail.com', ?, 2)";
      ps = con.prepareStatement(query);
      ps.setString(1, Security.encrypt("employer6", cipherType, keyString));
      ps.executeUpdate();
//</editor-fold>

      //<editor-fold defaultstate="collapsed" desc="Populate Industries Table">
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
//</editor-fold>

      //<editor-fold defaultstate="collapsed" desc="Populate application status Table">
      query = "INSERT INTO STATUSES (STATUS_NAME) VALUES ('Pending')";
      ps = con.prepareStatement(query);
      ps.executeUpdate();

      query = "INSERT INTO STATUSES (STATUS_NAME) VALUES ('Accepted')";
      ps = con.prepareStatement(query);
      ps.executeUpdate();

      query = "INSERT INTO STATUSES (STATUS_NAME) VALUES ('Rejected')";
      ps = con.prepareStatement(query);
      ps.executeUpdate();
//</editor-fold>

      //<editor-fold defaultstate="collapsed" desc="Populate job types table">
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
//</editor-fold>

      //<editor-fold defaultstate="collapsed" desc="Populate Job level table">
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
//</editor-fold>

      //<editor-fold defaultstate="collapsed" desc="Populate Employers Table">
      query = "INSERT INTO EMPLOYERS (USER_ID, EMP_NAME, EMP_OVERVIEW, EMP_ADDRESS, EMP_NUMBER)    VALUES (7, 'Google','Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum',             'Pasay City', '12345678912')";
      ps = con.prepareStatement(query);
      ps.executeUpdate();

      query = "INSERT INTO EMPLOYERS (USER_ID, EMP_NAME, EMP_OVERVIEW, EMP_ADDRESS, EMP_NUMBER)    VALUES (8, 'CityLand','Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum',            'Quezon City', '12345678912')";
      ps = con.prepareStatement(query);
      ps.executeUpdate();

      query = "INSERT INTO EMPLOYERS (USER_ID, EMP_NAME, EMP_OVERVIEW, EMP_ADDRESS, EMP_NUMBER)    VALUES (9, 'Manulife','Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum',            'Manila', '12345678912')";
      ps = con.prepareStatement(query);
      ps.executeUpdate();

      query = "INSERT INTO EMPLOYERS (USER_ID, EMP_NAME, EMP_OVERVIEW, EMP_ADDRESS, EMP_NUMBER)    VALUES (10, 'EEI Corporation','EEI Corporation is a leading provider of engineering and construction services in the Philippines. With a team of highly skilled engineers and technicians, we offer a comprehensive range of services including design, construction, and project management to help our clients build their dream projects',             'Makati', '+63 2 123-4567')";
      ps = con.prepareStatement(query);
      ps.executeUpdate();

      query = "INSERT INTO EMPLOYERS (USER_ID, EMP_NAME, EMP_OVERVIEW, EMP_ADDRESS, EMP_NUMBER)    VALUES (11, 'AdSpark Philippines','AdSpark Philippines is a dynamic and innovative company that specializes in providing digital marketing solutions to businesses of all sizes. Our team of experts combines cutting-edge technology and creativity to help our clients build their brand, attract more customers, and grow their business',             'Taguig', '+63 2 987-6543')";
      ps = con.prepareStatement(query);
      ps.executeUpdate();

      query = "INSERT INTO EMPLOYERS (USER_ID, EMP_NAME, EMP_OVERVIEW, EMP_ADDRESS, EMP_NUMBER)    VALUES (12, 'Monark Equipment Corporation','Monark Equipment Corporation is a leading manufacturer of industrial machinery and equipment in the Philippines. With state-of-the-art facilities and a team of experienced engineers and technicians, we design, build, and install high-quality machines that meet the needs of our clients in various industries',             'Pasig', '+63 2 456-7890')";
      ps = con.prepareStatement(query);
      ps.executeUpdate();

//</editor-fold>
      //<editor-fold defaultstate="collapsed" desc="Populate jobs table">
      query = "INSERT INTO JOBS (EMP_ID, JOB_TITLE, JOB_LOCATION, JOB_LEVEL,        JOB_DESC, JOB_RESP, JOB_REQS, JOB_BENEFIT, INDUSTRY_ID,        JOB_SALARY_MIN, JOB_SALARY_MAX, JOB_TYPE) VALUES (        1,'Junior Web Developer', 'Manila', 0,         'We are looking for a highly skilled and experienced Web Developer with a strong focus on technical SEO, page speed optimization, and ad pixel implementation. The ideal candidate will be responsible for revamping our website, optimizing user engagement, and enhancing conversion rates through their deep technical expertise.',        'Estimate workload and project delivery timeline.*Writing clean, high-quality, high-performance, maintainable code.*Develop applications in Vue.js.',        'Fluent English communication skills are a must.*Experience in consuming and integrating restful APIs in a Single Page JS application*.Sc/B.Sc in Computer Science, Engineering or relevant fields is an advantage but not required',        'Opportunities for promotion*Pay Raise*Promotion to Permanent Employee',        1, '22000', '25000', 0)";
      ps = con.prepareStatement(query);
      ps.executeUpdate();

      query = "INSERT INTO JOBS (EMP_ID, JOB_TITLE, JOB_LOCATION, JOB_LEVEL,        JOB_DESC, JOB_RESP, JOB_REQS, JOB_BENEFIT, INDUSTRY_ID,        JOB_SALARY_MIN, JOB_SALARY_MAX, JOB_TYPE) VALUES (        2,'Project Engineer', 'Manila', 3,        'As a Teller, you will handle administrative, operations, marketing and financial experience by supporting the branch business. When it comes to career growth, it is an opportunity to get valuable corporate experience while learning from seasoned veterans of a highly competitive field.',        'Collaborate with the Senior Engineers to create more efficient methods and maintain profitability*Develop the specifications for all equipment that is required for each project*Create the framework used to develop and monitor project metrics and manage the collection of project data',        'Licensed Civil Engineer*At least 3 Years experience',        'Opportunities for promotion*Pay Raise*Promotion to Permanent Employee',        7, '21000', '24000', 4)";
      ps = con.prepareStatement(query);
      ps.executeUpdate();

      query = "INSERT INTO JOBS (EMP_ID, JOB_TITLE, JOB_LOCATION, JOB_LEVEL,        JOB_DESC, JOB_RESP, JOB_REQS, JOB_BENEFIT, INDUSTRY_ID,        JOB_SALARY_MIN, JOB_SALARY_MAX, JOB_TYPE) VALUES (        3,'Financial Analyst', 'Manila', 2,         'The position is accountable for providing accurate, timely, and relevant monthly, quarterly and annual financial data production, reporting, analysis, planning and forecasting to different stakeholders of the Global Wealth and Asset Management & General Account (GWAM & GA) Finance Financial Planning & Analysis – Asia team.',        'Actively involved with consolidating, analyzing, and synthesizing large amount of financial and non-financial information from various stakeholders*Initiates improvements by exploring, identifying, and implementing reporting, analysis, and process solutions',        'Degree in BS Accountancy, preferably with Professional CPA license but not required*Knowledge of General Accounting principles*With 2-3 years of experience in the same field',        'Opportunities for promotion*Pay Raise*Promotion to Permanent Employee',        5, '20000', '23000', 3)";
      ps = con.prepareStatement(query);
      ps.executeUpdate();

      query = "INSERT INTO JOBS (EMP_ID, JOB_TITLE, JOB_LOCATION, JOB_LEVEL,        JOB_DESC, JOB_RESP, JOB_REQS, JOB_BENEFIT, INDUSTRY_ID,        JOB_SALARY_MIN, JOB_SALARY_MAX, JOB_TYPE) VALUES (       1,'Marketing Specialist', 'Rizal', 4,         'Seeking a creative and results-driven Marketing Specialist to join our dynamic team. As a Marketing Specialist, you will play a key role in developing and executing marketing strategies to promote our brand, products, and services. You will collaborate with cross-functional teams and external partners to drive customer engagement, increase brand awareness, and achieve marketing objectives.',        'Develop and execute marketing campaigns across various channels, including digital, social media, email, and traditional advertising.*Conduct market research and analyze consumer trends to identify target audiences and optimize marketing strategies.*Create compelling content, such as blog posts, social media posts, and website copy, to engage and inform our target customers.*Collaborate with design and creative teams to develop visually appealing and impactful marketing materials.*Monitor and analyze campaign performance metrics and provide actionable insights to improve marketing effectiveness.*Build and maintain relationships with external partners, such as agencies and influencers, to enhance brand visibility and reach.*Stay up to date with industry trends and best practices to drive innovation and continuous improvement in marketing strategies.',        'Degree in Marketing, Communications, or a related field.*Proven experience in marketing, advertising, or related roles.*Strong knowledge of marketing principles, strategies, and techniques.*Excellent written and verbal communication skills.*Proficiency in digital marketing tools and platforms, including social media management tools, email marketing software, and analytics platforms.*Analytical mindset with the ability to interpret data and metrics to drive data-driven marketing decisions.*Creative thinking and problem-solving abilities.*Strong project management and organizational skills.',        'Competitive salary and comprehensive benefits package.*Opportunities for career growth and professional development.*Collaborative and inclusive work environment.*Flexible work hours and remote work options.*Employee discounts on company products.*Health and wellness programs.*Paid time off and holidays.',        6, '80000', '90000', 4)";
      ps = con.prepareStatement(query);
      ps.executeUpdate();

      query = "INSERT INTO JOBS (EMP_ID, JOB_TITLE, JOB_LOCATION, JOB_LEVEL,        JOB_DESC, JOB_RESP, JOB_REQS, JOB_BENEFIT, INDUSTRY_ID,        JOB_SALARY_MIN, JOB_SALARY_MAX, JOB_TYPE) VALUES (       2,'Sales Representative', 'Quezon', 0,         'CityLand is seeking a motivated and enthusiastic Sales Representative to join our dynamic sales team. As a Sales Representative, you will play a vital role in driving revenue growth and building lasting relationships with our customers. You will actively prospect, qualify leads, and close deals to achieve sales targets and contribute to the overall success of CityLand.',        'Actively prospect and generate leads through various channels, including cold calling, networking events, and online research.*Conduct product presentations and demonstrations to potential customers, showcasing the value and benefits of CityLand products and services.*Develop and maintain strong relationships with existing customers, ensuring their satisfaction and identifying opportunities for upselling and cross-selling.*Understand customer needs and provide tailored solutions to meet their requirements.*Collaborate with the sales team to develop sales strategies and achieve sales goals.*Prepare and present sales proposals and negotiate contracts.*Stay updated on industry trends, competitor activities, and market conditions to identify new business opportunities.',        'Degree in Business, Marketing, or a related field (or equivalent work experience).*Previous experience in sales or customer service is a plus but not required for entry-level positions.*Excellent communication and interpersonal skills.*Strong negotiation and persuasive abilities.*Self-motivated with a proactive approach to sales.*Ability to work well in a team-oriented environment.*Goal-oriented mindset with a drive to achieve targets.',        'Competitive base salary with commission and bonus opportunities.*Comprehensive training and ongoing professional development.*Opportunities for career growth and advancement within the sales team.*Collaborative and supportive work environment.*Health and dental benefits package.*Paid time off and holidays.',        3, '40000', '60000', 1)";
      ps = con.prepareStatement(query);
      ps.executeUpdate();

      query = "INSERT INTO JOBS (EMP_ID, JOB_TITLE, JOB_LOCATION, JOB_LEVEL,        JOB_DESC, JOB_RESP, JOB_REQS, JOB_BENEFIT, INDUSTRY_ID,        JOB_SALARY_MIN, JOB_SALARY_MAX, JOB_TYPE) VALUES (       3,'Guest Services Associate', 'Tandang Sora', 0,         'Manulife is currently seeking a friendly and service-oriented Guest Services Associate to join our team. As a Guest Services Associate, you will be responsible for providing exceptional customer service and ensuring a positive experience for our guests. You will handle guest inquiries, assist with check-in/check-out procedures, and contribute to creating a welcoming and comfortable environment.',        'Greet and welcome guests in a professional and friendly manner.*Provide information and assistance to guests regarding their inquiries, reservations, and requests.*Assist with check-in and check-out procedures, including processing payments and issuing room keys.*Address and resolve guest concerns and complaints promptly and effectively.*Coordinate with other departments to fulfill guest requests and ensure a seamless experience.*Maintain a neat and organized front desk area, including managing guest registrations and records.*Promote and upsell hotel services and amenities to enhance the guest experience.*Ensure compliance with hotel policies and procedures, as well as health and safety regulations.',        'High school diploma or equivalent. Post-secondary education in hospitality or related field is a plus.*Previous experience in a customer service role, preferably in the hospitality industry.*Excellent communication and interpersonal skills.*Strong problem-solving and conflict resolution abilities.*Ability to multitask and prioritize tasks in a fast-paced environment.*Proficiency in using computer systems and hotel management software.*Flexibility to work shifts, including evenings, weekends, and holidays.*Knowledge of multiple languages is an asset.',        'Competitive hourly wage.*Comprehensive training and onboarding program.*Opportunities for career advancement within the hospitality industry.*Employee discounts on hotel services and amenities.*Health and dental benefits package.*Employee assistance program.*Paid time off and vacation benefits.',        8, '15000', '20000', 0)";
      ps = con.prepareStatement(query);
      ps.executeUpdate();

      query = "INSERT INTO JOBS (EMP_ID, JOB_TITLE, JOB_LOCATION, JOB_LEVEL,        JOB_DESC, JOB_RESP, JOB_REQS, JOB_BENEFIT, INDUSTRY_ID,        JOB_SALARY_MIN, JOB_SALARY_MAX, JOB_TYPE) VALUES (       4,'Structural Engineer', 'Enchanted Kingdom', 2,         'EEI Corporation, a leading engineering and construction company in the Philippines, is seeking a skilled and motivated Structural Engineer to join our team. As a Structural Engineer, you will play a vital role in designing, analyzing, and overseeing the construction of various structural projects. You will collaborate with multidisciplinary teams to ensure the integrity and safety of structures while meeting project objectives.',        'Perform structural analysis and design for a wide range of projects, including buildings, bridges, and other infrastructure projects.*Develop and review design drawings, specifications, and calculations in compliance with relevant codes and standards.*Conduct site inspections and assessments to evaluate structural conditions and provide recommendations.*Collaborate with architects, civil engineers, and other professionals to ensure the integration of structural elements into the overall design.*Prepare and review technical reports, feasibility studies, and construction documents.*Manage and coordinate with internal and external stakeholders to ensure project deliverables and timelines are met.*Stay updated with industry trends, advancements in structural engineering, and relevant codes and regulations.*Provide technical guidance and mentorship to junior engineers.',        'Degree in Civil Engineering or Structural Engineering. Master degree is a plus.*Professional Engineer (PE) license or equivalent certification.*Minimum of 5 years of experience in structural engineering, preferably in the design and construction of large-scale projects.*Proficiency in structural analysis software and design tools.*Strong knowledge of relevant design codes and standards.*Excellent analytical and problem-solving skills.*Effective communication and teamwork abilities.*Attention to detail and ability to manage multiple projects simultaneously.',        'Competitive salary package commensurate with experience.*Comprehensive benefits package, including health insurance and retirement plans.*Opportunities for career advancement and professional development.*Challenging and diverse projects that contribute to the development of the Philippines infrastructure.*Collaborative and inclusive work environment.*Access to industry-leading tools and technologies.',        7, '20000', '30000', 4)";
      ps = con.prepareStatement(query);
      ps.executeUpdate();

      query = "INSERT INTO JOBS (EMP_ID, JOB_TITLE, JOB_LOCATION, JOB_LEVEL,        JOB_DESC, JOB_RESP, JOB_REQS, JOB_BENEFIT, INDUSTRY_ID,        JOB_SALARY_MIN, JOB_SALARY_MAX, JOB_TYPE) VALUES (       5,'Education Program Manager', 'Katipunan', 2,         'AdSpark Philippines, a leading digital marketing agency, is seeking a passionate and experienced Education Program Manager to join our team. As an Education Program Manager, you will be responsible for developing and implementing educational programs and initiatives to empower businesses and individuals with digital marketing knowledge and skills. You will collaborate with internal teams, industry experts, and educational institutions to deliver impactful and engaging learning experiences.',        'Develop and manage comprehensive educational programs focused on digital marketing, including workshops, training sessions, and certification programs.*Collaborate with internal teams to identify training needs, design curriculum, and develop relevant content.*Coordinate with external trainers, industry experts, and educational partners to ensure high-quality program delivery.*Conduct research to stay updated with the latest digital marketing trends, tools, and best practices.*Evaluate and assess the effectiveness of educational programs through participant feedback and performance metrics.*Collaborate with marketing and communications teams to promote educational programs through various channels.*Provide guidance and support to participants, answering inquiries and addressing their educational needs.*Maintain relationships with educational institutions, industry associations, and relevant stakeholders.',        'Bachelors or Masters degree in Education, Marketing, Business, or a related field.*Minimum of 3 years of experience in education program management or instructional design, preferably in the digital marketing industry.*Strong knowledge of digital marketing concepts, strategies, and platforms.*Experience in curriculum development, instructional design, and program evaluation.*Excellent presentation and facilitation skills.*Strong project management and organizational abilities.*Proficient in using digital marketing tools and platforms.*Excellent communication and interpersonal skills.*Passion for learning and teaching.',        'Competitive salary package commensurate with experience.*Comprehensive benefits package, including health insurance and retirement plans.*Opportunities for professional development and growth within the digital marketing industry.*Collaborative and inclusive work environment.*Work with industry-leading professionals and experts.*Access to cutting-edge digital marketing tools and resources.',        4, '40000', '45000', 3)";
      ps = con.prepareStatement(query);
      ps.executeUpdate();

      query = "INSERT INTO JOBS (EMP_ID, JOB_TITLE, JOB_LOCATION, JOB_LEVEL,        JOB_DESC, JOB_RESP, JOB_REQS, JOB_BENEFIT, INDUSTRY_ID,        JOB_SALARY_MIN, JOB_SALARY_MAX, JOB_TYPE) VALUES (       6,'Medical Equipment Sales Specialist', 'Manila', 2,         'Monark Equipment Corporation, a trusted provider of high-quality medical equipment, is seeking a dynamic and results-oriented Medical Equipment Sales Specialist to join our team. As a Sales Specialist, you will play a crucial role in promoting and selling our medical equipment to healthcare facilities and professionals. Your expertise and customer-focused approach will contribute to improving patient care and supporting the healthcare industry.',        'Identify and generate sales opportunities by actively prospecting and building relationships with healthcare facilities, hospitals, clinics, and medical professionals.*Promote and demonstrate the features, benefits, and capabilities of Monark Equipment medical equipment to potential customers.*Conduct product presentations and provide technical expertise to assist customers in selecting the right equipment for their needs.*Collaborate with the sales team to develop and implement sales strategies to achieve sales targets and revenue growth.*Develop and maintain strong customer relationships, providing ongoing support, addressing inquiries, and resolving issues.*Stay updated on industry trends, market developments, and competitor activities to identify new business opportunities.*Prepare and submit sales reports, forecasts, and other documentation as required.*Attend industry conferences, trade shows, and seminars to enhance product knowledge and network with key stakeholders.',        'Bachelors degree in a healthcare-related field or Business Administration. A medical background is an advantage.*Minimum of 3 years of sales experience in the healthcare industry, preferably in medical equipment sales.*Strong knowledge of medical equipment and their applications, including but not limited to diagnostic imaging, patient monitoring, and surgical equipment.*Proven track record in achieving sales targets and building customer relationships.*Excellent communication and interpersonal skills.*Strong negotiation and presentation skills.*Self-motivated and results-driven with a customer-focused mindset.*Ability to work independently and collaboratively as part of a team.*Proficient in using CRM software and Microsoft Office Suite.*',        'Competitive salary package with performance-based incentives.*Comprehensive benefits package, including health insurance and retirement plans.*Continuous training and professional development opportunities.*Collaborative and supportive work environment.*Opportunities for career growth within a reputable company.*Access to high-quality medical equipment and technology.*Travel allowances and reimbursement for business-related expenses.',        2, '50000', '60000', 3)";
      ps = con.prepareStatement(query);
      ps.executeUpdate();

//</editor-fold>
      //<editor-fold defaultstate="collapsed" desc="Populate jobseekers table">
      query = "INSERT INTO JOBSEEKERS(    USER_ID, SEEKER_FNAME, SEEKER_LNAME, SEEKER_TITLE,    SEEKER_ABOUT,    SEEKER_EDUC_COURSE, SEEKER_EDUC_SCHOOL, SEEKER_EDUC_BATCH,    SEEKER_EXP_TITLE, SEEKER_EXP_COMPANY, SEEKER_EXP_BATCH,    SEEKER_SKILLS,    SEEKER_ADDRESS, SEEKER_NUMBER, SEEKER_ZOOMID) VALUES (    1, 'JR Gregg', 'Lagman', 'Web Developer',    'Experienced web developer with a strong background in front-end development and expertise in HTML, CSS, and JavaScript. Skilled in developing responsive and user-friendly websites and applications using modern frameworks such as React and Angular. Passionate about staying up-to-date with the latest web technologies and trends. A collaborative team player with excellent communication skills and a focus on delivering high-quality work.',    'University of Santo Tomas', 'B.S. Computer Science', '2018 - 2022',    'Web Developer Intern', 'Canva',' 2022 - Present',    'Strong Problem Solving and analytical Skills*Excellent communication and collaboration skills*Experience working in Agile Environments',    'Quezon City', '1234567890', 'jrgregglagman')";
      ps = con.prepareStatement(query);
      ps.executeUpdate();

      query = "INSERT INTO JOBSEEKERS(    USER_ID, SEEKER_FNAME, SEEKER_LNAME, SEEKER_TITLE,    SEEKER_ABOUT,    SEEKER_EDUC_COURSE, SEEKER_EDUC_SCHOOL, SEEKER_EDUC_BATCH,    SEEKER_EXP_TITLE, SEEKER_EXP_COMPANY, SEEKER_EXP_BATCH,    SEEKER_SKILLS,    SEEKER_ADDRESS, SEEKER_NUMBER, SEEKER_ZOOMID) VALUES (    2, 'Lancelot', 'Bulan', 'Civil Engineer',    'Dynamic civil engineer with experience in infrastructure design, construction and project management. Skilled in AutoCAD, SAP2000 and MS Project. Strong analytical and problem-solving abilities with a focus on ensuring projects are completed on time and within budget. Proven ability to work in a team and to communicate effectively with clients and stakeholders.',    'University of Santo Tomas', 'B.S. Civil Engineering', '2018 - 2022',    'Project Engineer', 'Ayala', '2022 - Present',    'Strong Problem Solving and analytical Skills*Excellent communication and collaboration skills*Experience working in Agile Environments',    'Quezon City', '1234567890', 'lancelotbulan')";
      ps = con.prepareStatement(query);
      ps.executeUpdate();

      query = "INSERT INTO JOBSEEKERS(    USER_ID, SEEKER_FNAME, SEEKER_LNAME, SEEKER_TITLE,    SEEKER_ABOUT,    SEEKER_EDUC_COURSE, SEEKER_EDUC_SCHOOL, SEEKER_EDUC_BATCH,    SEEKER_EXP_TITLE, SEEKER_EXP_COMPANY, SEEKER_EXP_BATCH,    SEEKER_SKILLS,    SEEKER_ADDRESS, SEEKER_NUMBER, SEEKER_ZOOMID) VALUES (    3, 'Jay', 'Ambal', 'Financial Analyst',    'Experienced financial analyst with expertise in financial modeling and analysis, forecasting, and budgeting. Skilled in Excel, Bloomberg Terminal, and other financial software. Strong analytical and problem-solving abilities with a focus on delivering accurate and actionable insights to support investment decisions. Proven ability to work independently and as part of a team.',    'University of Santo Tomas', 'B.S. Accountancy', '2018 - 2022',    'Finance Intern', 'Some Company', '2022 - Present',    'Strong Problem Solving and analytical Skills*Excellent communication and collaboration skills*Experience working in Agile Environments',    'Quezon City', '1234567890', 'jayambal')";
      ps = con.prepareStatement(query);
      ps.executeUpdate();

      query = "INSERT INTO JOBSEEKERS(    USER_ID, SEEKER_FNAME, SEEKER_LNAME, SEEKER_TITLE,    SEEKER_ABOUT,    SEEKER_EDUC_COURSE, SEEKER_EDUC_SCHOOL, SEEKER_EDUC_BATCH,    SEEKER_EXP_TITLE, SEEKER_EXP_COMPANY, SEEKER_EXP_BATCH,    SEEKER_SKILLS,    SEEKER_ADDRESS, SEEKER_NUMBER, SEEKER_ZOOMID) VALUES (    4, 'Miguel', 'Lozol', 'Marketing Specialist',    'I am a driven and results-oriented marketing professional with 5 years of experience in digital marketing. My expertise includes creating and executing successful social media campaigns, managing email marketing programs, and developing engaging content for websites and blogs.',    'De La Salle University', 'B.S. Business Administration', '2015 - 2018',    'Digital Marketing Manager', 'PayMaya',' 2022 - Present',    'Social media marketing*Email marketing*Content creation*Google Analytics*SEO*SEM*Project management',    'Makati City', '+639123456789', 'miguellozol')";
      ps = con.prepareStatement(query);
      ps.executeUpdate();

      query = "INSERT INTO JOBSEEKERS(    USER_ID, SEEKER_FNAME, SEEKER_LNAME, SEEKER_TITLE,    SEEKER_ABOUT,    SEEKER_EDUC_COURSE, SEEKER_EDUC_SCHOOL, SEEKER_EDUC_BATCH,    SEEKER_EXP_TITLE, SEEKER_EXP_COMPANY, SEEKER_EXP_BATCH,    SEEKER_SKILLS,    SEEKER_ADDRESS, SEEKER_NUMBER, SEEKER_ZOOMID) VALUES (    5, 'Carson', 'Herrera', 'Human Resources Manager',    'I am a seasoned HR professional with over 10 years of experience in talent acquisition, performance management, employee relations, and HR operations. My passion is to help organizations build and maintain a positive and productive workplace culture that attracts and retains top talent.',    'University of the Philippines', 'B.S. Psychology', '2008 - 2012',    'Senior HR Business Partner', 'Unrequited Love',' 2017 - Present',    'Recruitment and selection*Performance management*Employee relations*HR policies and procedures*HRIS*Training and development*Leadership development',    'La Union', '+639987654321', '7years')";
      ps = con.prepareStatement(query);
      ps.executeUpdate();

      query = "INSERT INTO JOBSEEKERS(    USER_ID, SEEKER_FNAME, SEEKER_LNAME, SEEKER_TITLE,    SEEKER_ABOUT,    SEEKER_EDUC_COURSE, SEEKER_EDUC_SCHOOL, SEEKER_EDUC_BATCH,    SEEKER_EXP_TITLE, SEEKER_EXP_COMPANY, SEEKER_EXP_BATCH,    SEEKER_SKILLS,    SEEKER_ADDRESS, SEEKER_NUMBER, SEEKER_ZOOMID) VALUES (    6, 'Dude', 'Pare Chong', 'Software Engineer',    'I am a highly motivated and skilled software engineer with 3 years of experience in developing and implementing software solutions. I have expertise in full-stack development, database management, and system integration. My goal is to continuously enhance my skills and knowledge to deliver innovative and efficient solutions to complex problems.',    'Ateneo de Manila University', 'B.S. Computer Science', '2019 - 2022',    'Junior Software Developer', 'Popup',' 2021 - Present',    'Full-stack development*Database management*System integration*Agile development*Java*Python*JavaScript*ReactJS*AngularJS*Node.js*SQL*MongoDB*Git',    'Katips', '+639876543210', 'dudeparechong')";
      ps = con.prepareStatement(query);
      ps.executeUpdate();

//</editor-fold>
      //<editor-fold defaultstate="collapsed" desc="Populate applications table">
      query = "INSERT INTO APPLICATIONS(    SEEKER_ID, EMPLOYER_ID, JOB_ID, APP_STATUS) VALUES (4,1,1,0)";
      ps = con.prepareStatement(query);
      ps.executeUpdate();

      query = "INSERT INTO APPLICATIONS(    SEEKER_ID, EMPLOYER_ID, JOB_ID, APP_STATUS) VALUES (5,2,2,1)";
      ps = con.prepareStatement(query);
      ps.executeUpdate();

      query = "INSERT INTO APPLICATIONS(    SEEKER_ID, EMPLOYER_ID, JOB_ID, APP_STATUS) VALUES (6,3,3,2)";
      ps = con.prepareStatement(query);
      ps.executeUpdate();
//</editor-fold>
      System.out.println("Successfully populated.");
      ps.close();
      con.close();
    } catch (SQLException | ClassNotFoundException sqle) {
      sqle.printStackTrace();
    }
  }

  public static void dropTables() {
    try {
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
    } catch (SQLException | ClassNotFoundException sqle) {
      System.out.println("Aborted Dropping tables as they do not exist yet.");
    }
  }

  public static void createTables() {
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
