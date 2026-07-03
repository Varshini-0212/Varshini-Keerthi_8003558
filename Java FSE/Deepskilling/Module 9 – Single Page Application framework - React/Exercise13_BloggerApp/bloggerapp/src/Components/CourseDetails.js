function CourseDetails(props){

    return(

        <div>

            {

                props.courses.map(course=>

                    <div key={course.id}>

                        <h2>{course.cname}</h2>

                        <h4>{course.date}</h4>

                    </div>

                )

            }

        </div>

    );

}

export default CourseDetails;