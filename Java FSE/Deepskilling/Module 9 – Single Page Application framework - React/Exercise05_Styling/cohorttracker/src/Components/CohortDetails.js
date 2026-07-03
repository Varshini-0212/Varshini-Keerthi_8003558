import cohorts from "./cohorts";
import styles from "./CohortDetails.module.css";

function CohortDetails() {

    return (

        <div>

            <h1>Cohorts Details</h1>

            {
                cohorts.map((cohort,index)=>(
                    <div className={styles.box} key={index}>

                        <h3
                            style={{
                                color:
                                    cohort.currentStatus==="Ongoing"
                                        ? "green"
                                        : "blue"
                            }}
                        >
                            {cohort.code}
                        </h3>

                        <dl>

                            <dt>Technology</dt>
                            <dd>{cohort.technology}</dd>

                            <dt>Trainer</dt>
                            <dd>{cohort.trainer}</dd>

                            <dt>Coach</dt>
                            <dd>{cohort.coach}</dd>

                            <dt>Status</dt>
                            <dd>{cohort.currentStatus}</dd>

                        </dl>

                    </div>
                ))
            }

        </div>

    );

}

export default CohortDetails;