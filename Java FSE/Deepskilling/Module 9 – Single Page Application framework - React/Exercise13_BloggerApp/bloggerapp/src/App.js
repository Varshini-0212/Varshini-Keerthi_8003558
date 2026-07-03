import './App.css';

import BookDetails from './Components/BookDetails';
import BlogDetails from './Components/BlogDetails';
import CourseDetails from './Components/CourseDetails';

import {books,blogs,courses} from './Data';

function App(){

  return(

      <div className="container">

        <div className="column">

          <h1>Course Details</h1>

          <CourseDetails courses={courses}/>

        </div>

        <div className="column">

          <h1>Book Details</h1>

          <BookDetails books={books}/>

        </div>

        <div className="column">

          <h1>Blog Details</h1>

          <BlogDetails blogs={blogs}/>

        </div>

      </div>

  );

}

export default App;