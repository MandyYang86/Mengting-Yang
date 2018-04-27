module.exports = function(app){
    var bloglist=[
        {id:1,title:"blog1",author:"bob",introduction:"ng serve --proxy-config proxy.config.json",content:"ng serve --proxy-config proxy.config.json"},
        {id:2,title:"blog2",author:"bob",introduction:"ng serve --proxy-config proxy.config.json",content:"ng serve --proxy-config proxy.config.json"},
        {id:3,title:"blog3",author:"bob",introduction:"ng serve --proxy-config proxy.config.json",content:"ng serve --proxy-config proxy.config.json"},
        {id:4,title:"blog4",author:"bob",introduction:"ng serve --proxy-config proxy.config.json",content:"ng serve --proxy-config proxy.config.json"}
    ]
    var userlist = [
        {   username:'bob',
            password:'123',
            email:'123@qq.com',
            address:'medford',
            city:'boston',
            state:'MA',
            gender:'male',
            zipcode:0o2155,
            courses:[],
            diet:["fat loss"],
            blogs:[]
        }
    ]
    //GET Calls!
    app.get('/api/blog',getBlogs);

    app.get('/api/:blogid/detail',getBlogById);

    //PUT Calls!
    app.put('/api/:username/addBlog',addBlogByUser);
    /*API implementation*/
    function getBlogs(req,res){
        res.json(bloglist);
    }
    
    function getBlogById(req,res){
        var id = req.params.blogid;
        for(var i =0; i < bloglist.length; i++){
            if(id==bloglist[i].id){
                res.json(bloglist[i]);
            }
        }
    }
    function addBlogByUser(req,res){
        var username = req.params.username;
        var blog = req.body;
        blog.author=username;
        bloglist.unshift(blog);
        for(var i =0; i < userlist.length; i++){
            if(username===userlist[i].username){
                userlist[i].blogs.push(blog);
                res.json(blog);
            }
        }
    }
}