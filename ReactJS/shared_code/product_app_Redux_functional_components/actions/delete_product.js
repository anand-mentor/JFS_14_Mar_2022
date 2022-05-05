const DeleteProductAction = (products, productId) => {
    let productIndex = -1;
    products.map((product, index)=> {
        if(product.id === productId) {
            productIndex = index;
        }
    })
    if(productIndex != -1)
        products.splice(productIndex, 1);
    return {
        type: 'DELETE_PRODUCT',
        payload: [...products]
    }
}

export default DeleteProductAction;
