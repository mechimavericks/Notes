<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Student Feedback form of Kanakai Multiple Campus Surunga">
    <meta name="keywords" content="kanakai student feedback form, kanakai campus form, kanakai college feedback form, kanakai college surunga student form, chetan acharya form, kanakai college student feedbcak form">
    <title>Student Feedback and Suggestion Form</title>
    <link rel="stylesheet" href="style.css">
    <script defer src="script.js"></script>
    <link rel="shortcut icon" href="icons/icon.png" type="image/x-icon">
</head>
<body>
    <div class="container">
        <div class="heading">
            <h1>Student Feedback & Suggestion Form</h1>
        </div>
        <form autocomplete="off" action="send.php" method="post">
            <label for="name">Name:</label>
            <p id="nameerror"></p>
            <input type="text" id="name" name="name" placeholder="Enter Your Name" required>
            <label for="phone">Contact(Optional):</label>
            <input type="tel" id="phone" name="phone" pattern="[0-9]{10}" placeholder="Enter Your Number">
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" placeholder="Enter Your Email">
            <p id="textareaerror"></p>
            <label for="question">Question:</label>
            <textarea name="question" id="question" cols="30" rows="10" placeholder="Ask Your Question." value=""></textarea>
            <label for="problem">Problem:</label>
            <textarea name="problem" id="problem" cols="30" rows="10" placeholder="Mentioned Your Problem."></textarea>
            <label for="suggestion">Suggestion:</label>
            <textarea name="suggestion" id="suggestion" cols="30" rows="10" placeholder="Mentioned Your Suggestion"></textarea>
            <div class="buttons">
                <button type="reset">Clear</button>
                <button id="send">Send</button>
                <button id="submit" type="submit" name="submit">Submit</button>
            </div>
        </form>
        <footer>
            <h6>Developed & Designed by <br/><span><a href="https://bhandari-santosh.com.np/" target="_blank">Santosh Bhandari</a></span></h6>
            <p class="problem"><a href="mailto:info@bhandari-santosh.com.np">Report a Problem</a></p>
        </footer>
    </div>
</body>
</html>