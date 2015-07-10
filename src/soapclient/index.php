<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <?php
         
            $sum = 0;
            try{
              $client = new SoapClient("http://localhost:9999/ws/image?wsdl", array("trace" => 1, "exception" => 1));
              $result = $client->downloadImage("image.jpg");
            }catch(SoapFault $fault){
                echo "SOAP Fault: (faultcode: {$fault->faultcode}, faultstring: {$fault->faultstring})";
            }
            file_put_contents("img.png", $result);
    
            //var_dump($result);
//            $data = base64_decode($result);
//            //var_dump($data);
//            $im = imagecreatefromstring($data);
//            if ($im !== false) {
//                header('Content-Type: image/png');
//                imagepng($im);
//                imagedestroy($im);
//            }
//            else {
//                echo 'An error occurred.';
//            }
        ?>
    </body>
</html>
