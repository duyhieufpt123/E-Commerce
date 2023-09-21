import { Button, Grid, Typography } from "@mui/material";
import React from "react";

const Footer = () => {
  return (
    <div>
      <Grid
        className="bg-black text-white text-center mt-10"
        container
        sx={{ bgcolor: "black", color: "white", py: 3 }}
      >
        <Grid item xs={12} sm={6} md={3}>
          <Typography className="pb-5" variant="h6">
            Contact
          </Typography>
          <div>
            <Button className="pb-5" variant="h6">
              Contact Us
            </Button>
          </div>
          <Button className="pb-5" variant="h6">
            Live Chat
          </Button>
          <div>
            <Button className="pb-5" variant="h6">
              Email Supports
            </Button>
          </div>

          <Button className="pb-5" variant="h6">
            Customer Service
          </Button>
        </Grid>

        <Grid item xs={12} sm={6} md={3}>
          <Typography className="pb-5" variant="h6">
            Policies
          </Typography>
          <div>
            <Button className="pb-5" variant="h6">
              Privacy Policy
            </Button>
          </div>
          <Button className="pb-5" variant="h6">
            Return Policy
          </Button>
          <div>
            <Button className="pb-5" variant="h6">
              Shipping Information
            </Button>
          </div>
          <Button className="pb-5" variant="h6">
            Terms and Conditions
          </Button>
        </Grid>

        <Grid item xs={12} sm={6} md={3}>
          <Typography className="pb-5" variant="h6">
            Support
          </Typography>
          <div>
            <Button className="pb-5" variant="h6">
              Help Center
            </Button>
          </div>
          <Button className="pb-5" variant="h6">
            FAQs
          </Button>
          <div>
            <Button className="pb-5" variant="h6">
              Warranty Information
            </Button>
          </div>
          <Button className="pb-5" variant="h6">
            Product Manuals
          </Button>
        </Grid>

        <Grid item xs={12} sm={6} md={3}>
          <Typography className="pb-5" variant="h6">
            Feedback
          </Typography>
          <div>
            <Button className="pb-5" variant="h6">
              Customer Reviews
            </Button>
          </div>
          <Button className="pb-5" variant="h6">
            Rating
          </Button>
          <div>
            <Button className="pb-5" variant="h6">
              Surveys
            </Button>
          </div>

          <Button className="pb-5" variant="h6">
            Improvment Suggestions
          </Button>
        </Grid>

        <Grid className="pt-20" item xs={12}>
          <Typography variant="body2" component="p" align="center">
            &copy; {new Date().getFullYear()} NecesGear. All rights
            reserved.
          </Typography>
        </Grid>
      </Grid>
    </div>
  );
};

export default Footer;
