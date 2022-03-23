<div class="container">
    <div class="row"> <!-- Banner -->
        <div class="col-sm-12">
            <img src="../assets/banner2.png" alt="banner">
        </div>
    </div> <!-- End banner -->

    <div class="row"> <!-- First row -->
        <div class="col-sm-6">
            <h4>${welcomeMessage}</h4>

        </div>

        <div class="col-sm-6"> <!-- Right column-->
            <g:textField name="phone" class="form-control" placeholder="Enter your cell number to check in" value="${customerInstance?.phone}"/>
            <div class="row">
                <h1></h1>
            </div>
            <div class="row">
                <div class = "col-sm-4"> <!-- First Button Row -->
                    <input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="1" onclick="padkey(this.value)"/>
                </div>
                <div class = "col-sm-4">
                    <input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="2" onclick="padkey(this.value)"/>
                </div>
                <div class = "col-sm-4">
                    <input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="3" onclick="padkey(this.value)"/>
                </div>
            </div>
            <div class="row">
                <h1></h1>
            </div>
            <div class="row"> <!-- Second Button Row Spacer -->
                <div class = "col-sm-4">
                    <input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="4" onclick="padkey(this.value)"/>
                </div>
                <div class = "col-sm-4">
                    <input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="5" onclick="padkey(this.value)"/>
                </div>
                <div class = "col-sm-4">
                    <input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="6" onclick="padkey(this.value)"/>
                </div>
            </div>
            <div class="row">
                <h1></h1>
            </div>
            <div class="row"> <!-- Third Button Row Spacer -->
                <div class = "col-sm-4">
                    <input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="7" onclick="padkey(this.value)"/>
                </div>
                <div class = "col-sm-4">
                    <input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="8" onclick="padkey(this.value)"/>
                </div>
                <div class = "col-sm-4">
                    <input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="9" onclick="padkey(this.value)"/>
                </div>
            </div>
            <div class="row">
                <h1></h1>
            </div>
            <div class="row"> <!-- Fourth Button Row Spacer -->
                <div class = "col-sm-4">
                <g:link class="btn btn-danger btn-lg btn-block" action="checkin">Del</g:link>
                </div>
                <div class = "col-sm-4">
                    <input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="0" onclick="padkey(this.value)"/>
                </div>
                <div class = "col-sm-4">
                    <g:submitButton class="btn btn-success btn-lg btn-block" name="pad" value="Go" />
                </div>
            </div>
        </div><!-- End right column-->
    </div><!-- End first row-->
</div> <!-- End container-->

<script>
    function padkey(num){
        var txt = document.getElementById("phone").value;
        txt = txt + num;
        document.getElementById("phone").value = txt;
    }

    function clearPhone(){
        document.getElementById("phone").value = "";
    }
</script>