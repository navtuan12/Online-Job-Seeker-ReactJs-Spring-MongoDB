package com.navtuan12.job_seeker_server.services;

import java.util.List;
import org.bson.types.ObjectId;
import com.navtuan12.job_seeker_server.dto.request.job.JobSearchRequest;
import com.navtuan12.job_seeker_server.dto.request.job.JobUpdateRequest;
import com.navtuan12.job_seeker_server.dto.request.job.JobUploadRequest;
import com.navtuan12.job_seeker_server.dto.response.JobResponse;
import com.navtuan12.job_seeker_server.dto.response.JobSearchResponse;

public interface JobService {

    JobResponse uploadJob(JobUploadRequest request, String companyEmail);
    List<JobSearchResponse> jobSearch(JobSearchRequest request);

    JobSearchResponse getJobDetail(ObjectId jobId);
    List<JobSearchResponse> getSimilarJobs(JobSearchResponse job);
    
    JobResponse updateJob(ObjectId id, JobUpdateRequest request);

    void deleteJob(ObjectId jobId);
}
