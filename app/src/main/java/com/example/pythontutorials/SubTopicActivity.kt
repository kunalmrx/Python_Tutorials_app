package com.example.pythontutorials

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SubTopicActivity : AppCompatActivity() {
    lateinit var recyclerFavourite: RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var topicheader:TextView
    var videolist = arrayListOf<VideoLinkDes>()
    lateinit var recyclerAdapter: VideoLinkRecyclerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub_topic)
        var title=intent.getStringExtra("title")
        var id=intent.getStringExtra("id")

        topicheader=findViewById(R.id.topicTitle)
        topicheader.text=title

        recyclerFavourite = findViewById(R.id.subtopicrecycler)
        layoutManager = GridLayoutManager(this, 1)

        when(id)
        {
            "1" ->
                {
                    videolist.add(VideoLinkDes("1","How to Get Started With Python?","In this tutorial, you will learn to install and run Python on your computer. Once we do that, we will also write our first Python program.\n" +
                            "Python is a cross-platform programming language, which means that it can run on multiple platforms like Windows, macOS, Linux, and has even been ported to the Java and .NET virtual machines. It is free and open-source.\n" +
                            "\n" +
                            "Even though most of today's Linux and Mac have Python pre-installed in it, the version might be out-of-date. So, it is always a good idea to install the most current version.","https://youtu.be/xCixkaXrVMI"))
                    videolist.add(VideoLinkDes("2","Python Keywords and Identifiers","Keywords are the reserved words in Python.\n" +
                            "\n" +
                            "We cannot use a keyword as a variable name, function name or any other identifier. They are used to define the syntax and structure of the Python language.\n" +
                            "\n" +
                            "In Python, keywords are case sensitive.","https://youtu.be/JvMwnGY2EjU"))
                    videolist.add(VideoLinkDes("3","Python Statement, Indentation ","Python Statement\n" +
                            "Instructions that a Python interpreter can execute are called statements. For example, a = 1 is an assignment statement. if statement, for statement, while statement, etc. are other kinds of statements which will be discussed later.\n\nPython Indentation\n" +
                            "Most of the programming languages like C, C++, and Java use braces { } to define a block of code. Python, however, uses indentation.","https://youtu.be/iOFXY2lH-vo"))
                    videolist.add(VideoLinkDes("4","Python Variables, Constants and Literals","Python Variables\n" +
                            "A variable is a named location used to store data in the memory. It is helpful to think of variables as a container that holds data that can be changed later in the program. For example,","https://youtu.be/Pqbz4eWrU3U"))
                    videolist.add(VideoLinkDes("5","Python Data Types","Every value in Python has a datatype. Since everything is an object in Python programming, data types are actually classes and variables are instance (object) of these classes.\n" +
                            "\n" +
                            "There are various data types in Python. Some of the important types are listed below.","https://youtu.be/gCCVsvgR2KU"))
                    videolist.add(VideoLinkDes("6","Python Type Conversion and Type Casting","The process of converting the value of one data type (integer, string, float, etc.) to another data type is called type conversion. Python has two types of type conversion.\n" +
                            "\n" +
                            "Implicit Type Conversion\n" +
                            "Explicit Type Conversion","https://youtu.be/I-QhCWq5Jao"))
                    videolist.add(VideoLinkDes("7","Python Input, Output and Import","This tutorial focuses on two built-in functions print() and input() to perform I/O task in Python. Also, you will learn to import modules and use them in your program.\n" +
                            "Python provides numerous built-in functions that are readily available to us at the Python prompt.\n" +
                            "\n" +
                            "Some of the functions like input() and print() are widely used for standard input and output operations respectively. Let us see the output section first.","https://youtu.be/3_aRpCOEp5Y"))
                    videolist.add(VideoLinkDes("8","Python Operators","What are operators in python?\n" +
                            "Operators are special symbols in Python that carry out arithmetic or logical computation. The value that the operator operates on is called the operand.","https://youtu.be/v5MR5JnKcZI"))
                    recyclerAdapter = VideoLinkRecyclerAdapter(this, videolist)
                    recyclerFavourite.adapter = recyclerAdapter
                    recyclerFavourite.layoutManager = layoutManager
                }


            "2" ->
            {
                videolist.add(VideoLinkDes("1","Python if...else Statement","Decision making is required when we want to execute a code only if a certain condition is satisfied.\n" +
                        "\n" +
                        "The if…elif…else statement is used in Python for decision making.","https://youtu.be/PqFKRqpHrjw"))
                videolist.add(VideoLinkDes("2","Python for Loop","The for loop in Python is used to iterate over a sequence (list, tuple, string) or other iterable objects. Iterating over a sequence is called traversal.\n\n\n\n\nSyntax of for Loop\n" +
                        "for val in sequence:\n" +
                        "\tBody of for","https://youtu.be/0ZvaDa8eT5s"))
                videolist.add(VideoLinkDes("3","Python while Loop","The while loop in Python is used to iterate over a block of code as long as the test expression (condition) is true.\n" +
                        "\n" +
                        "We generally use this loop when we don't know the number of times to iterate beforehand.\n" +
                        "\n" +
                        "Syntax of while Loop in Python\n" +
                        "while test_expression:\n" +
                        "    Body of while","https://youtu.be/HZARImviDxg"))
                videolist.add(VideoLinkDes("4","Python break and continue","In Python, break and continue statements can alter the flow of a normal loop.\n" +
                        "\n" +
                        "Loops iterate over a block of code until the test expression is false, but sometimes we wish to terminate the current iteration or even the whole loop without checking test expression.\n" +
                        "\n" +
                        "The break and continue statements are used in these cases.\n" +
                        "\n" +
                        "Python break statement\n" +
                        "The break statement terminates the loop containing it. Control of the program flows to the statement immediately after the body of the loop.\n" +
                        "\n" +
                        "If the break statement is inside a nested loop (loop inside another loop), the break statement will terminate the innermost loop.","https://youtu.be/yCZBnjF4_tU"))
                videolist.add(VideoLinkDes("5","Python pass statement","In Python programming, the pass statement is a null statement. The difference between a comment and a pass statement in Python is that while the interpreter ignores a comment entirely, pass is not ignored.\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"However, nothing happens when the pass is executed. It results in no operation (NOP).\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"Syntax of pass\\n\" +\n" +
                        "                        \"pass\\n\" +\n" +
                        "                        \"We generally use it as a placeholder.\"","https://youtu.be/yCZBnjF4_tU"))
                recyclerAdapter = VideoLinkRecyclerAdapter(this, videolist)
                recyclerFavourite.adapter = recyclerAdapter
                recyclerFavourite.layoutManager = layoutManager
            }

            "3" ->
            {
                videolist.add(VideoLinkDes("1","Python Functions","In Python, a function is a group of related statements that performs a specific task.\n" +
                        "\n" +
                        "Functions help break our program into smaller and modular chunks. As our program grows larger and larger, functions make it more organized and manageable.\n" +
                        "\n" +
                        "Furthermore, it avoids repetition and makes the code reusable.","https://youtu.be/BVfCWuca9nw"))
                videolist.add(VideoLinkDes("2","Python Function Arguments","In the user-defined function topic, we learned about defining a function and calling it. Otherwise, the function call will result in an error. Here is an example.\n" +
                        "\n" +
                        "def greet(name, msg):\n" +
                        "    \"\"\"This function greets to\n" +
                        "    the person with the provided message\"\"\"\n" +
                        "    print(\"Hello\", name + ', ' + msg)\n" +
                        "\n" +
                        "greet(\"Monica\", \"Good morning!\")","https://youtu.be/ijXMGpoMkhQ"))
                videolist.add(VideoLinkDes("3","Python Recursion","Recursion is the process of defining something in terms of itself.\n" +
                        "\n" +
                        "A physical world example would be to place two parallel mirrors facing each other. Any object in between them would be reflected recursively.","https://youtu.be/XkL3SUioNvo"))
                videolist.add(VideoLinkDes("4","Python Anonymous/Lambda Function","In Python, an anonymous function is a function that is defined without a name.\n" +
                        "\n" +
                        "While normal functions are defined using the def keyword in Python, anonymous functions are defined using the lambda keyword.\n" +
                        "\n" +
                        "Hence, anonymous functions are also called lambda functions.","https://youtu.be/hYzwCsKGRrg"))
                videolist.add(VideoLinkDes("5","Python Global, Local and Nonlocal variables","In Python, a variable declared outside of the function or in global scope is known as a global variable. This means that a global variable can be accessed inside or outside of the function.\n" +
                        "\n" +
                        "Let's see an example of how a global variable is created in Python.","https://youtu.be/QYUbLevwgDQ"))
                videolist.add(VideoLinkDes("6","Python Modules","Modules refer to a file containing Python statements and definitions.\n" +
                        "\n" +
                        "A file containing Python code, for example: example.py, is called a module, and its module name would be example.\n" +
                        "\n" +
                        "We use modules to break down large programs into small manageable and organized files. Furthermore, modules provide reusability of code.\n" +
                        "\n" +
                        "We can define our most used functions in a module and import it, instead of copying their definitions into different programs.","https://youtu.be/1RuMJ53CKds"))
                videolist.add(VideoLinkDes("7","Python Package","We don't usually store all of our files on our computer in the same location. We use a well-organized hierarchy of directories for easier access.\n" +
                        "\n" +
                        "Similar files are kept in the same directory, for example, we may keep all the songs in the \"music\" directory. Analogous to this, Python has packages for directories and modules for files.\n" +
                        "\n" +
                        "As our application program grows larger in size with a lot of modules, we place similar modules in one package and different modules in different packages. This makes a project (program) easy to manage and conceptually clear.\n" +
                        "\n" +
                        "Similarly, as a directory can contain subdirectories and files, a Python package can have sub-packages and modules.","https://youtu.be/RiWqigGW9cA"))

                recyclerAdapter = VideoLinkRecyclerAdapter(this, videolist)
                recyclerFavourite.adapter = recyclerAdapter
                recyclerFavourite.layoutManager = layoutManager
            }

            "4" ->
            {
                videolist.add(VideoLinkDes("1","Python Numbers","In this article, you'll learn about the different numbers used in Python, how to convert from one data type to the other, and the mathematical operations supported in Python.","https://youtu.be/5RNTXFEqkLk"))
                videolist.add(VideoLinkDes("2","Python List","In Python programming, a list is created by placing all the items (elements) inside square brackets [], separated by commas.\n" +
                        "\n" +
                        "It can have any number of items and they may be of different types (integer, float, string etc.).","https://youtu.be/Eaz5e6M8tL4"))
                videolist.add(VideoLinkDes("3","Python Tuple","A tuple is created by placing all the items (elements) inside parentheses (), separated by commas. The parentheses are optional, however, it is a good practice to use them.\n" +
                        "\n" +
                        "A tuple can have any number of items and they may be of different types (integer, float, list, string, etc.).","https://youtu.be/GstQPTWpt88"))
                videolist.add(VideoLinkDes("4","Python Strings","What is String in Python?\n" +
                        "A string is a sequence of characters.\n" +
                        "\n" +
                        "A character is simply a symbol. For example, the English language has 26 characters.\n" +
                        "\n" +
                        "Computers do not deal with characters, they deal with numbers (binary). Even though you may see characters on your screen, internally it is stored and manipulated as a combination of 0s and 1s.\n" +
                        "\n" +
                        "This conversion of character to a number is called encoding, and the reverse process is decoding. ASCII and Unicode are some of the popular encodings used.\n" +
                        "\n" +
                        "In Python, a string is a sequence of Unicode characters. Unicode was introduced to include every character in all languages and bring uniformity in encoding. You can learn about Unicode from Python Unicode.","https://youtu.be/lSItwlnF0eU"))
                videolist.add(VideoLinkDes("5","Python Sets","A set is an unordered collection of items. Every set element is unique (no duplicates) and must be immutable (cannot be changed).\n" +
                        "\n" +
                        "However, a set itself is mutable. We can add or remove items from it.\n" +
                        "\n" +
                        "Sets can also be used to perform mathematical set operations like union, intersection, symmetric difference, etc.","https://youtu.be/MEPlLAjPvXY"))
                videolist.add(VideoLinkDes("6","Python Dictionary","Creating a dictionary is as simple as placing items inside curly braces {} separated by commas.\n" +
                        "\n" +
                        "An item has a key and a corresponding value that is expressed as a pair (key: value).\n" +
                        "\n" +
                        "While the values can be of any data type and can repeat, keys must be of immutable type (string, number or tuple with immutable elements) and must be unique.","https://youtu.be/2IsF7DEtVjg"))

                recyclerAdapter = VideoLinkRecyclerAdapter(this, videolist)
                recyclerFavourite.adapter = recyclerAdapter
                recyclerFavourite.layoutManager = layoutManager
            }

            "5" ->
            {
                videolist.add(VideoLinkDes("1","Introduction to File in Python\n","What is File?\n" +
                        "\t\tWhich operations we do in File?\n" +
                        "\t\tFile mode in Python.\n","https://www.youtube.com/watch?v=MpHo6dC6Ky0&t=306s"))
                videolist.add(VideoLinkDes("2","Opening and Reading a File","open()- Open a file in read , write or in append mode.\n" +
                        "\t\tread()- Read the content of the file.\n" +
                        "\t\treadline()- Return one line from the file.\n","https://www.youtube.com/watch?v=Q9K_wFj5DuQ&t=437s"))
                videolist.add(VideoLinkDes("3","Writing and Appending to a File","To create a new file in Python, use the open() method, with one of the following parameters:\n" +
                        "\t\tx- create \n" +
                        "\t\ta- append\n" +
                        "\t\tw- write\n","https://www.youtube.com/watch?v=ZNIe4Nf-6-c&t=4s"))
                videolist.add(VideoLinkDes("4","seek() ,tell() and more","seek() sets the file's current position at the offset.\n" +
                        "\t \ttell() returns the current position of the file read/write pointer within the file.\n","https://www.youtube.com/watch?v=stcJipumWwY"))

                recyclerAdapter = VideoLinkRecyclerAdapter(this, videolist)
                recyclerFavourite.adapter = recyclerAdapter
                recyclerFavourite.layoutManager = layoutManager
            }

            "6" ->
            {
                videolist.add(VideoLinkDes("1","Classes and objects(OOPS)","Python is an object oriented programming language.\n" +
                        "\t\tAlmost everything in Python is an object, with its properties and methods.\n" +
                        "\t\tA Class is like an object constructor, or a \"blueprint\" for creating objects.\n","https://www.youtube.com/watch?v=o6zPAzl4ZtM"))
                videolist.add(VideoLinkDes("2","Inheritace","Inheritance allows us to define a class that inherits all the methods and properties from another class.","https://www.youtube.com/watch?v=Cn7AkDb4pIU"))
                videolist.add(VideoLinkDes("3","Abstraction and Encapsulation","Data abstraction and encapsulation are synonymous as data abstraction is achieved through encapsulation.\n","https://www.youtube.com/watch?v=9wd50TKv_OQ"))
                videolist.add(VideoLinkDes("4","Polymorphism","Polymorphism is based on the greek words Poly (many) and morphism (forms).  We will create a structure that can take or use many forms of objects","https://www.youtube.com/watch?v=9wd50TKv_OQ"))
                videolist.add(VideoLinkDes("5","Method Overloading and Overriding","Method Overloading is an example of Compile time polymorphism.\n" +
                        "\t\tMethod overriding is an example of run time polymorphism.\n","https://www.youtube.com/watch?v=CcTzTuIsoFk"))

                recyclerAdapter = VideoLinkRecyclerAdapter(this, videolist)
                recyclerFavourite.adapter = recyclerAdapter
                recyclerFavourite.layoutManager = layoutManager
            }

            "7" ->
            {
                videolist.add(VideoLinkDes("1","Advanced Tutorial","check out the link for advanced tutotial  : https://www.programiz.com/python-programming","https://youtu.be/_uQrJ0TkZlc"))


                recyclerAdapter = VideoLinkRecyclerAdapter(this, videolist)
                recyclerFavourite.adapter = recyclerAdapter
                recyclerFavourite.layoutManager = layoutManager
            }

            "8" ->
            {
                videolist.add(VideoLinkDes("1","date time module ","Python has a module named datetime to work with dates and times.","https://www.youtube.com/watch?v=u9cHEJivgPA"))

                recyclerAdapter = VideoLinkRecyclerAdapter(this, videolist)
                recyclerFavourite.adapter = recyclerAdapter
                recyclerFavourite.layoutManager = layoutManager
            }

            "9" ->
            {
                videolist.add(VideoLinkDes("1","About Python Programming",":- Free and open-source - You can freely use and distribute Python, even for commercial use.\n" +
                        "\t\tEasy to learn - Python has a very simple and elegant syntax. It's much easier to read and write Python programs compared to other languages like C++, Java, C#.\n" +
                        "\t\tPortable - You can move Python programs from one platform to another, and run it without any changes.\n","https://youtu.be/WvhQhj4n6b8"))

                recyclerAdapter = VideoLinkRecyclerAdapter(this, videolist)
                recyclerFavourite.adapter = recyclerAdapter
                recyclerFavourite.layoutManager = layoutManager
            }

            "10" ->
            {
                videolist.add(VideoLinkDes("1","Why Learn Python?","Python is easy to learn. Its syntax is easy and code is very readable.\n" +
                        "\t\tPython has a lot of applications. It's used for developing web applications, data science, rapid application development, and so on.\n" +
                        "\t\tPython allows you to write programs in fewer lines of code than most of the programming languages.\n","https://youtu.be/MolWKHA7rRY"))

                recyclerAdapter = VideoLinkRecyclerAdapter(this, videolist)
                recyclerFavourite.adapter = recyclerAdapter
                recyclerFavourite.layoutManager = layoutManager
            }

            "11" ->
            {
                videolist.add(VideoLinkDes("1","How to learn Python?","Official Python tutorial - Might be hard to follow and understand for beginners. Visit the official Python tutorial.\n" +
                        "\t\tWrite a lot of Python code- The only way you can learn programming is by writing a lot of code.\n","https://youtu.be/5mJ_Qftw2_0"))

                recyclerAdapter = VideoLinkRecyclerAdapter(this, videolist)
                recyclerFavourite.adapter = recyclerAdapter
                recyclerFavourite.layoutManager = layoutManager
            }

            "12" ->
            {
                videolist.add(VideoLinkDes("1","Python Examples","check out the video for more information","https://www.programiz.com/python-programming/examples"))
                videolist.add(VideoLinkDes("2","Python References","check out the video for more information","https://www.programiz.com/python-programming/methods"))
                videolist.add(VideoLinkDes("3","Python Online Compiler","check out the video for more information","https://www.programiz.com/python-programming/online-compiler"))
                videolist.add(VideoLinkDes("4","Python Guide","check out the video for more information","https://www.programiz.com/python-programming/guide"))
                recyclerAdapter = VideoLinkRecyclerAdapter(this, videolist)
                recyclerFavourite.adapter = recyclerAdapter
                recyclerFavourite.layoutManager = layoutManager
            }


            else-> {}
        }
    }
}