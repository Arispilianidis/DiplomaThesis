# DiplomaThesis
Automated digital transformation of HR business processes to web applications

Digital transformation is the process of using digital technologies to create new - or modify 
existing - business processes to respond to changing market needs. So, the need is obvious, 
especially now, because of the ongoing pandemic, where companies need to adapt quickly to 
the required changes in the way they operate. This diploma thesis aspires to respond to the 
above need, automating the digital transformation of business processes, emphasizing in the 
human resources department, and producing specialized web applications for each of them.

As part of this effort, in this diploma thesis, MDE (Model Driven Engineering) is utilized. More 
specifically, once an abstract process model is defined, a series of transformations takes place, 
resulting in a functional full-stack application for it. In this way, the software development 
process is accelerated, and software is produced more reliably.

In this diploma thesis, the EzProcess system is implemented, in which the user through a 
friendly graphical user interface, sets parameters for the business processes of the human 
resources department, that he wants to transform. These processes refer specifically to the 
description of a job, the evaluation of the candidates who applied for the above position and 
finally their onboarding into the company with their successful evaluation. In addition, the 
above processes are interdependent in the EzProcess system, resulting in fewer human 
mistakes and at the same time even easier and faster software development. Based on these 
parameters the user has set, the executable code that performs the digital transformation of 
the processes is created and the corresponding web applications, which include both the 
client and the server part, are generated. The latter provide in the background additional 
capabilities of user identification, sorting and database search of candidates, by 
communicating with the generated server API.

# Installation

You must first download the Eclipse Modeling Tools software from the 
link: https://www.eclipse.org/downloads/packages/release/2020-03/r/eclipse modeling-tools.
This software provides tools for creating applications that are
based on models. Then, when starting Eclipse, the user must
follow the path Help -> Install new software and select the
Eclipse version downloaded earlier. Then you have to type
<Acceleo> in the search bar to find the packages you need
install. Additionally, you must perform the same procedure to download
Eclipse plugin <Sirius>. Installation of  Eclipse Modeling Tools is
now ready.
For the operation of the EzProcess system the steps to be followed by the
user are the following:
* Download the EzProcess system files from the link:
https://github.com/Arispilianidis/DiplomaThesis
* Import in Eclipse as project files the 3 folders
EzProcess, EzProcessGenerator and EzProcessGenerator.ui
* In the EzProcess / model / folder right click on the ezProcess.genmodel file and
to select GenerateAll.
* Open a new run-time and import the folders MyEzProcess and EzProcess.design
*  Open the MyEzProcess / represantations.aird file, and model the
desired procedures.
* If the process modeling is valid, you can right-click
MyEzProcess / MyEzProcess.ezprocess file and select “Acceleo Model To Text-> Generate Code ”
At this point two folders will be generated in the MyEzProcess / src-gen / folder, with names
Output and Server. The Output folder includes the client part, that is
the React application while the Server folder contains the necessary files that
compose the server API.

# Documentation

For the server to work, the user must follow these steps:
1) Download the Node.js. This environment also contains the framework
Express.js.
2) Open a terminal window, and after navigating to the
desired folder execute the command: npm install express-generator-g
3) Create a folder that contains the API with the command: express myapi.
4) Copy the contents of the generated Server / myapi / folder to
previously created myapi folder, following every prompt for
file replacement that the operating system will show.
5) Browse through the terminal in the myapi folder with the command: cd myapi
6) Execute the command: npm install.
7) Execute the command: npm start. At this point the server is set up
and runs on the default channel 3000 on the computer's localhost.

Once the user has downloaded the Node.js environment, they can now create any
React application, ie the client part of the system. The user must follow these steps:
1) Open a terminal window, and after navigating to the desired folder,
execute the command: npx create-react-app myapp
2) Copy the contents of the generated Output folder to the folder
myapp, following any file replacement prompts shown by the
operating system.
3) Navigate through the terminal to the myapp folder with the command: cd myapp
4) Execute the command: npm install.
5) Execute the command: npm start. At this point the client has been created and
because the server is running on the default channel 3000 on its localhost
computer, the client will be prompted to run on a different channel (3001).
