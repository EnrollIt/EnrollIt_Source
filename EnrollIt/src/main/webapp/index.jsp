<!DOCTYPE html>

<html lang="en">
<!-- InstanceBegin template="/Templates/anonymous.dwt" codeOutsideHTMLIsLocked="false" -->


<head>
    <meta charset="utf-8">
    <meta content="IE=edge" http-equiv="X-UA-Compatible">
    <meta content="width=device-width, initial-scale=1" name="viewport">
    <!-- InstanceBeginEditable name="TITLE" -->


    <title>Enrollit</title>
    <link href="images/logoIcon.png" rel="icon" type="image/png">
    <!-- InstanceEndEditable -->
    <!-- Bootstrap -->
    <link href="css/bootstrap.css" rel="stylesheet">
    <link href="css/custom.css" rel="stylesheet">
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <link href="css/font-awesome.css" rel="stylesheet">
    <!-- eoverriding the current bootstrap classes and ceating other reqired classes -->
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="js/html5shiv.min.js"></script>
      <script src="js/respond.min.js"></script>
    <![endif]-->
</head>

<body>

    <header>
        <div class="row">
            <div class="col-lg-2 col-md-2 col-sm-2 col-xs-12">
                <a class="logo" href="index.html" itemprop="url" title=
                "Link to Home page"><img alt="logo" class="img-responsive"
                itemprop="logo" src="./images/logo.png"></a>
            </div>


            <div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
                <ul class="pull-right">
                    <li class="enrollitHeaderLogin">
                        <a data-target=".loginModal" data-toggle="modal" href=
                        "#">Login</a>
                    </li>


                    <li class="enrollitHeaderSignUp">
                        <a data-target=".signUPModal" data-toggle="modal" href=
                        "#">Sign Up</a>
                    </li>
                </ul>
            </div>
        </div>
    </header>
    <div aria-labelledby="mySmallModalLabel" class="modal fade loginModal"
    role="dialog" tabindex="-1">
        <div class="modal-dialog modal-sm enroolitLoginUp">
            <button class="close" data-dismiss="modal" type=
            "button"><span aria-hidden="true" class=
            "fa fa-close"></span><span class="sr-only">Close</span></button>

            <div class="modal-content popUpLogin">
                <div class="row enrollitPopUpImg"><img alt="..." class=
                "img-responsive" src="images/logoPopUp.png">
                </div>


                <div class="clearfix">
                    <div class="row">
                        <div class=
                        "form-group col-lg-12 col-md-12 col-sm-12 col-xs-12">
                            <div class=
                            "col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                <input class="form-control" id="EmailAddress"
                                placeholder="Email Address" type="text">
                            </div>
                        </div>
                    </div>


                    <div class="row">
                        <div class=
                        "form-group col-lg-12 col-md-12 col-sm-12 col-xs-12">
                            <div class=
                            "col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                <input class="form-control" id="Password"
                                placeholder="Password" type="text">
                            </div>
                        </div>
                    </div>


                    <div class="clearfix">
                        <div class=
                        "col-lg-12 col-md-12 col-sm-12 col-xs-12 SignUpPanel">
                            <div class=
                            "col-lg-6 col-md-6 col-sm-6 col-xs-12pull-left">
                                <label for="rewards"><input id="rewards" type=
                                "checkbox">&nbsp;remember me</label>
                            </div>
                            <button class=
                            "btn btnSignUp col-lg-6 col-md-6 col-sm-6 col-xs-12"
                            type="button">Login Up</button>
                        </div>
                    </div>


                    <div class="clearfix">
                        <div class=
                        "col-lg-12 col-md-12 col-sm-12 col-xs-12 enrollitPopUpSocialIcon">
                        <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                <button class=
                                "btn enrollitPopUpSocialIconFacebook col-lg-12"
                                type="button">Facebook</button>
                            </div>


                            <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                <button class=
                                "btn enrollitPopUpSocialIconGoogle col-lg-12 pull-right"
                                type="button">Google+</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div aria-labelledby="mySmallModalLabel" class=
    "modal fade col-lg-12 signUPModal" role="dialog" tabindex="-1">
        <div class="modal-dialog modal-sm enroolitSignUp">
            <button class="close" data-dismiss="modal" type=
            "button"><span aria-hidden="true" class=
            "fa fa-close"></span><span class="sr-only">Close</span></button>

            <div class="modal-content col-lg-12 popSignUpLogin">
                <div class="row enrollitPopUpImg"><img alt="..." class=
                "img-responsive" src="images/logoPopUp.png">
                </div>


                <div class="clearfix">
                    <div class="row">
                        <div class=
                        "form-group col-lg-12 col-md-12 col-sm-12 col-xs-12">
                            <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                <input class="form-control" id="FirstName"
                                placeholder="First Name" type="text">
                            </div>


                            <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                <input class="form-control" id="LastName"
                                placeholder="Last Name" type="text">
                            </div>
                        </div>
                    </div>


                    <div class="row">
                        <div class=
                        "form-group col-lg-12 col-md-12 col-sm-12 col-xs-12">
                            <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                <input class="form-control" id="EmailAddress"
                                placeholder="Email Address" type="text">
                            </div>


                            <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                <input class="form-control" id="Mobile"
                                placeholder="+91 Mobile" type="text">
                            </div>
                        </div>
                    </div>


                    <div class="row">
                        <div class=
                        "form-group col-lg-12 col-md-12 col-sm-12 col-xs-12">
                            <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                <input class="form-control" id="Password"
                                placeholder="Password" type="text">
                            </div>


                            <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                <input class="form-control" id=
                                "ConfirmPassword" placeholder=
                                "Confirm Password" type="text">
                            </div>
                        </div>
                    </div>


                    <div class="clearfix">
                        <div class="col-lg-12 SignUpPanel">
                            <button class="btn btnSignUp col-lg-12" type=
                            "button">Sign Up</button>
                        </div>
                    </div>


                    <div class="clearfix">
                        <div class=
                        "col-lg-12 col-md-12 col-sm-12 col-xs-12 enrollitPopUpSocialIcon">
                        <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                <button class=
                                "btn enrollitPopUpSocialIconFacebook col-lg-12"
                                type="button">Facebook</button>
                            </div>


                            <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                <button class=
                                "btn enrollitPopUpSocialIconGoogle col-lg-12 pull-right"
                                type="button">Google+</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="carousel slide carousel-fade" data-ride="carousel">
        <div class="carousel-inner" role="listbox">
            <div class="item active">
            </div>


            <div class="item">
            </div>


            <div class="item">
            </div>
        </div>
    </div>


    <section>
        <nav class="clearfix enrollitNav">
            <ul class="col-lg-offset-3 col-lg-6">
                <li> <a href="index.html">Home</a></li>
                <li> <a href="#">Abou US</a></li>
                <li><a href="#">Contact US</a></li>
            </ul>
        </nav>


        <div class="container">
            <div class="clearfix enrollitBannerText">
                <div class="col-lg-offset-2 col-lg-8 text-center">
                    <img alt="..." class="img-responsive" src=
                    "images/banner_cartoon.png">

                    <h2>Why drain so much sweat standing in queue for
                    submitting forms when we are here to do the same on the go
                    !!!</h2>
                </div>


                <div class="col-lg-2 col-md-2 col-sm-2 col-xs-12">
                </div>
            </div>


            <div class="clearfix enrollitBannerSearch">
                <div class="col-lg-12">
                    <form class="navbar-form smallB2b-Navform" role="search">
                        <div class="input-group col-lg-offset-2 col-lg-9">
                            <input class="form-control" name="q" placeholder=
                            "Site Search" type="text">

                            <div class="input-group-btn">
                                <button class="btn btn-default" type=
                                "submit"><i class="fa fa-search"></i></button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>


            <div class="clearfix enrollitBannerStuParSchImg">
                <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
                    <a href="search_list_page.html">
                    <h2 class="enrollitTabText text-center">Student</h2>
                    <img alt="..." class="img-responsive" src=
                    "images/banner_student.png">

                    <div class="enrollitStudent">
                    </div></a>
                </div>


                <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
                    <a href="search_list_page.html">
                    <h2 class="enrollitTabText text-center">Parents</h2>
                    <img alt="..." class="img-responsive" src=
                    "images/banner_parents.png">

                    <div class="enrollitParents">
                    </div></a>
                </div>


                <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
                    <a href="search_list_page.html">
                    <h2 class="enrollitTabText text-center">School</h2>
                    <img alt="..." class="img-responsive" src=
                    "images/banner_school.png">

                    <div class="enrollitSchool">
                    </div></a>
                </div>


                <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
                    <a href="search_list_page.html">
                    <h2 class="enrollitTabText text-center">Tutor</h2>
                    <img alt="..." class="img-responsive" src=
                    "images/banner_tutor.png">

                    <div class="enrollitTutior">
                    </div></a>
                </div>
            </div>
        </div>
    </section>
    <div class="clearfix">
        <footer class="col-lg-12 col-md-12 col-sm-12 col-lg-12 enrollitFooter">
            <div class="copyRightRow col-lg-6 col-md-6 col-sm-6 col-lg-12">
                <p class="text-muted">© 2014 Enrollit.in | <a href="#">Site
                Map</a> | <a href="#">Privacy Policy & Legal Disclaimer</a></p>
            </div>


            <div class="col-lg-6 col-md-6 col-sm-6 col-lg-12">
                <ul>
                    <li class="fbSprite rgtPad-0">
                        <a class="fbSprite" href=
                        "https://facebook.com/enrollit"><i class=
                        "fa fa-facebook"></i></a>
                    </li>


                    <li class="twitterSprite">
                        <a class="twitterSprite" href=
                        "https://twitter.com/enrollit"><i class=
                        "fa fa-twitter"></i></a>
                    </li>


                    <li class=" linkedinSprite">
                        <a class="linkedinSprite" href=
                        "https://linkedin.com/company/enrollit"><i class=
                        "fa fa-linkedin"></i></a>
                    </li>


                    <li class=" youtubeSprite">
                        <a class="youtubeSprite" href=
                        "https://youtube.com/enrollit"><i class=
                        "fa fa-youtube"></i></a>
                    </li>
                </ul>
            </div>
        </footer>
    </div>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="js/jquery-1.11.1.min.js">
    </script> 
    <!-- Include all compiled plugins (below), or include individual files as needed --> 
    <script src="js/bootstrap.min.js">
    </script> <!-- InstanceBeginEditable name="Page Related Script" -->
</body>
</html>