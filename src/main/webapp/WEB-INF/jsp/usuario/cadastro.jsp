<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>
    <meta name="description" content=""/>
    <meta name="author" content=""/>
    <title>Cadastro de Usu�rio MDPS</title>
    <!-- Favicon-->
    <link rel="icon" type="image/x-icon" href="../../assets/favicon.ico"/>
    <!-- Font Awesome icons (free version)-->
    <script src="https://use.fontawesome.com/releases/v6.1.0/js/all.js" crossorigin="anonymous"></script>
    <!-- Google fonts-->
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css"/>
    <link href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet"
          type="text/css"/>
    <!-- Core theme CSS (includes Bootstrap)-->
    <link href="../../css/styles.css" rel="stylesheet"/>
</head>
<body id="page-top">
<!-- Navigation-->
<!-- Masthead-->
<!-- Contact Section-->
<section class="page-section" id="contact">
    <div class="container">
        <!-- Contact Section Heading-->
        <h2 class="page-section-heading text-center text-uppercase text-secondary mb-0">Cadastro de Usu�rios</h2>
        <!-- Icon Divider-->
        <div class="divider-custom">
            <div class="divider-custom-line"></div>
            <div class="divider-custom-icon"><i class="fas fa-star"></i></div>
            <div class="divider-custom-line"></div>
        </div>
        <!-- Contact Section Form-->
        <div class="row justify-content-center">
            <div class="col-lg-8 col-xl-7">
                <!-- * * * * * * * * * * * * * * *-->
                <!-- * * SB Forms Contact Form * *-->
                <!-- * * * * * * * * * * * * * * *-->
                <!-- This form is pre-integrated with SB Forms.-->
                <!-- To make this form functional, sign up at-->
                <!-- https://startbootstrap.com/solution/contact-forms-->
                <!-- to get an API token!-->
                <form action="/usuario/incluir" method="post" id="contactForm" data-sb-form-api-token="API_TOKEN">

                    <div class="form-floating mb-3 text-center">
                        <div class="form-check-inline">
                            <input class="form-check-input form-check-inline" type="radio" name="tipo" id="doula"
                                   value="D">
                            <label class="form-check-label" for="doula">
                                Doula
                            </label>
                        </div>
                        <div class="form-check-inline">
                            <input class="form-check-input form-check-inline" type="radio" name="tipo" id="gestante"
                                   value="G">
                            <label class="form-check-label" for="gestante">
                                Gestante
                            </label>
                        </div>

                        <div class="form-check-inline">
                            <input class="form-check-input form-check-inline" type="checkbox" name="admin"
                                   id="administrador" value="true"
                            >
                            <label class="form-check-label" for="administrador">
                                 Desejo ser admin
                            </label>
                        </div>
                    </div>

                    <div class="form-floating mb-3">
                        <input class="form-control" name="nome" id="name" type="text" placeholder="Enter your name..."
                               data-sb-validations="required"/>
                        <label for="name">Nome</label>
                        <div class="invalid-feedback" data-sb-feedback="name:required">A name is required.</div>
                    </div>
                    <!-- Email address input-->
                    <div class="form-floating mb-3">
                        <input class="form-control" name="email" id="email" type="email" placeholder="name@example.com"
                               data-sb-validations="required,email"/>
                        <label for="email">Email address</label>
                        <div class="invalid-feedback" data-sb-feedback="email:required">An email is required.</div>
                        <div class="invalid-feedback" data-sb-feedback="email:email">Email is not valid.</div>
                    </div>

                    <!-- Message senha-->
                    <div class="form-floating mb-3">
                        <div class="mb-3 row">
                            <label for="inputPassword" class="col-sm-2 col-form-label">Password</label>
                            <div class="form-control col-sm-10">
                                <input type="password" name="senha" class="form-control" id="inputPassword">
                            </div>
                        </div>
                        <div class="invalid-feedback" data-sb-feedback="message:required">A senha � necess�ria</div>
                    </div>

                    <!-- Submit success message-->
                    <!---->
                    <!-- This is what your users will see when the form-->
                    <!-- has successfully submitted-->
                    <div class="d-none" id="submitSuccessMessage">
                        <div class="text-center mb-3">
                            <div class="fw-bolder">Form submission successful!</div>
                            To activate this form, sign up at
                            <br/>
                            <a href="https://startbootstrap.com/solution/contact-forms">https://startbootstrap.com/solution/contact-forms</a>
                        </div>
                    </div>
                    <!-- Submit error message-->
                    <!---->
                    <!-- This is what your users will see when there is-->
                    <!-- an error submitting the form-->
                    <div class="d-none" id="submitErrorMessage">
                        <div class="text-center text-danger mb-3">Error sending message!</div>
                    </div>
                    <!-- Submit Button-->
                    <button class="btn btn-primary btn-xl" id="submitButton" type="submit">Send</button>
                </form>
            </div>
        </div>
    </div>
</section>