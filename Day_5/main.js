// GLOBAL
var products = []; 
var cartItem = [];
var cart_n = document.getElementById('cart_n'); 

// DIVS
var frutsDiv = document.getElementById('fruitsDiv'); 
 
var saladDiv = document.getElementById('saladDiv'); 
var juiceDiv = document.getElementById('juiceDiv'); 

//INFORMATION  
var fruits = [{name:'Apple',  price:9},
              {name:'Orange',  price:10},
              {name:'Strawberry',  price:11},
              {name:'Kiwi',  price:12},
              {name:'Banana',  price:13}  ]; 
var juice = [{name:'Juice #01',  price:11},{name:'Juice #02',  price:12},{name:'juice #03',  price:13}];
var salad = [{name:'Salad #01',  price:11}, {name:'Salad #02',  price:12}, {name:'Salad #03',  price:12}];  

//HTML
function showFruit(con){
    let URL = `./images/fruit/fruits${con}.jpg`;
    console.log(URL);
    let btn = `btnFruits${con}`; 
    return `
    
        <div class="col-md-4">
            <div class="card mb-4 shadow-sm">
                <img class="card-img-top" style="hight:16rem;" src="${URL}" alt="Card img cap">
                <div class="card-body">
                    <i style:"color:#ffae00;" class="fa-solid fa-star" ></i>
                    <i class="fa-solid fa-star" style:"color:#ffae00;"></i>
                    <i class="fa-solid fa-star" style:"color:#ffae00;"></i>
                    <i class="fa-solid fa-star" style:"color:#ffae00;"></i>
                    <i class="fa-solid fa-star" style:"color:#ffae00;"></i>
                    <p class="card-text">${fruits[con-1].name}</p>
                    <p class="card-text">${fruits[con-1].price}.00</p>
                    <div class="d-flex justify-content-between align-items-center">
                        <div class="btn-group">
                            <button type="button" class="btn btn-sm btn-outline-secondary" onclick="cart2('${fruits[con-1].name}','${fruits[con-1].price}','${URL}','${con}','${btn}')" ><a style="color:inherit;" href="cart.html">Buy</a></button>
                            <button type="button" class='btn btn-sm btn-outline-secondary' id="${btn}" onclick="cart('${fruits[con-1].name}','${fruits[con-1].price}','${URL}','${con}','${btn}' )" >Add to cart</button>
                        </div>
                        <small class="text-muted">Free Shopping</small>
                    </div>
                </div>
            </div>
        </div>
   
    `
}
function showJuicet(con){
    let URL = `./images/juice/juice${con}.jpg`;
    console.log(URL);
    let btn = `btnJuice${con}`; 
    return `
    
        <div class="col-md-4">
            <div class="card mb-4 shadow-sm">
                <img class="card-img-top" style="hight:16rem;" src="${URL}" alt="Card img cap">
                <div class="card-body">
                    <i style:"color:#ffae00;" class="fa-solid fa-star" ></i>
                    <i class="fa-solid fa-star" style:"color:#ffae00;"></i>
                    <i class="fa-solid fa-star" style:"color:#ffae00;"></i>
                    <i class="fa-solid fa-star" style:"color:#ffae00;"></i>
                    <i class="fa-solid fa-star" style:"color:#ffae00;"></i>
                    <p class="card-text">${juice[con-1].name}</p>
                    <p class="card-text">${juice[con-1].price}.00</p>
                    <div class="d-flex justify-content-between align-items-center">
                        <div class="btn-group">
                            <button type="button" class="btn btn-sm btn-outline-secondary" onclick="cart2('${juice[con-1].name}','${juice[con-1].price}','${URL}',' ${con}','${btn}')" ><a style="color:inherit;" href="cart.html">Buy</a></button>
                            <button type="button" class='btn btn-sm btn-outline-secondary' id="${btn}" onclick="cart('${juice[con-1].name}','${juice[con-1].price}','${URL}',' ${con}','${btn}' )" >Add to cart</button>
                        </div>
                        <small class="text-muted">Free Shopping</small>
                    </div>
                </div>
            </div>
        </div>
   
    `
}
function showSalad(con){
    let URL = `./images/salad/salad${con}.jpg`;
    console.log(URL);
    let btn = `btnJuice${con}`; 
    return `
    
        <div class="col-md-4">
            <div class="card mb-4 shadow-sm">
                <img class="card-img-top" style="hight:16rem;" src="${URL}" alt="Card img cap">
                <div class="card-body">
                    <i style:"color:#ffae00;" class="fa-solid fa-star" ></i>
                    <i class="fa-solid fa-star" style:"color:#ffae00;"></i>
                    <i class="fa-solid fa-star" style:"color:#ffae00;"></i>
                    <i class="fa-solid fa-star" style:"color:#ffae00;"></i>
                    <i class="fa-solid fa-star" style:"color:#ffae00;"></i>
                    <p class="card-text">${salad[con-1].name}</p>
                    <p class="card-text">${salad[con-1].price}.00</p>
                    <div class="d-flex justify-content-between align-items-center">
                        <div class="btn-group">
                            <button type="button" class="btn btn-sm btn-outline-secondary" onclick="cart2('${salad[con-1].name}','${salad[con-1].price}','${URL}',' ${con}','${btn}')" ><a style="color:inherit;" href="cart.html">Buy</a></button>
                            <button type="button" class='btn btn-sm btn-outline-secondary' id="${btn}" onclick="cart('${salad[con-1].name}','${salad[con-1].price}','${URL}',' ${con}','${btn}' )" >Add to cart</button>
                        </div>
                        <small class="text-muted">Free Shopping</small>
                    </div>
                </div>
            </div>
        </div>
   
    `
}


// ANiMATION ALERT
function animation(){
    const toast = swal.mixin({
        toast:true,  
        positon:'top-end', 
        showConfirmButton:false,
        timer:1000
    }); 
    new toast({
        type:'success',
        title:'Added to shoping cart'
    })
}

// CART FUNCTION
function cart(name,price,url,con,btncart){
    var items={
        name:name,
        price:price, 
        url:url, 
    }
    cartItem.push(items);   
    debugger; 
    let storage = JSON.parse(localStorage.getItem("cart"));
    if(storage == null){
        products.push(items); 
        localStorage.setItem("cart",JSON.stringify(products)); 
    }else{
        products =JSON.parse(localStorage.getItem("cart")); 
        products.push(items); 
        localStorage.setItem("cart",JSON.stringify(products)); 
    }
    products =JSON.parse(localStorage.getItem("cart")); 
    cart_n.innerHTML = `[${products.length}]`;
    document.getElementById(btncart).style.display="none";
    animation();
}
function cart2(name,price,url,con,btncart){
    var items={
        name:name,
        price:price, 
        url:url, 
    }
    cartItem.push(items);   
    debugger; 
    let storage = JSON.parse(localStorage.getItem("cart"));
    if(storage == null){
        products.push(items); 
        localStorage.setItem("cart",JSON.stringify(products)); 
    }else{
        products =JSON.parse(localStorage.getItem("cart")); 
        products.push(items); 
        localStorage.setItem("cart",JSON.stringify(products)); 
    }
    products =JSON.parse(localStorage.getItem("cart")); 
    cart_n.innerHTML = `[${products.length}]`;
    document.getElementById(btncart).style.display="none";
}

// RENDER
function render(){
    for (let index = 1; index <= 5; index++) {
       frutsDiv.innerHTML +=`${showFruit(index)}`
    }

    for (let index = 1; index <= 3; index++) {
        juiceDiv.innerHTML +=`${showJuicet(index)}`;
        saladDiv.innerHTML +=`${showSalad(index)}`; 
    }
    if(localStorage.getItem("cart") == null){

    }else{
        products=JSON.parse(localStorage.getItem("cart"));  
        cart_n.innerHTML = [`${products.length}`] || 0;  
    }

}
