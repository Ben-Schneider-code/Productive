# Group 6

## Productive Vision Statement 


&emsp; Productive is an app that allows the user to track and monitor their productivity using a task system and a difficulty scale. The app will encourage and reward the user by gamifying the tasks that they define for themselves.  These mechanics will create the incentive necessary to encourage the user to keep on schedule, entirely for free. Most importantly, Productive makes both difficult and mundane tasks fun!  

&emsp; Productive is an app designed for those who may struggle with scheduling and self-motivation, especially students. In these uncertain times, it is more arduous than ever for students to find a way to motivate themselves and stay on task. Productive will provide a satisfying anchor for those busy, forgetful, and easily-distracted students. Students are the largest consumer of games –– among other distractions –– which will expedite their indoctrination into the world of gamified tasks!  

&emsp; Unlike existing productivity apps, Productive will assist the users in the completion of their mundane or difficult tasks, such as doing the dishes or writing an essay through the use of an experience system. Users will be able to attach a visible value to their tasks, and Productive will use these values to assign an experience value as a reward for completing a task. Similar to a video game, a user will use this experience to unlock various cosmetic features for their personalization within the app. This gamifying of tasks will aid the user by making their tasks feel as satisfying as the other distractions available to them. The experience system in Productive will also incentivise users to complete repeated tasks, such as weekly laundry, through the use of ‘streaks’. As the user keeps up with their repeated tasks, they will build a ‘streak’ which will increase their experience gain. These pieces come together to build a cohesive and game-like productivity tracking app.  

&emsp; A growing issue for students in the modern world is procrastination –– the ‘pushing off’ of their schedule, especially given the multitude of distractions available. Productive will encourage users to stay on track with their designed schedule through the use of schedule reminders and experience rewards for completing their tasks on schedule. Users will add and manage tasks to create a schedule to help the users organize their day. Productive will use this schedule to remind users of the tasks that they still need to complete that day, thereby alleviating procrastination caused by distraction or forgetfulness. Users can rest assured that they will be reminded of their tasks, small and large alike, and won’t need to occupy their memory with every menial item on their to-do list.

&emsp; The goal of the app is to reach as many people as possible. As such, the goal of Productive is to achieve 100,000 regular users. The reason we chose this as our success criteria is because the number of total downloads would include many people who download the app without using it regularly, and thus fails to portray the engagement of the user base. A regular user is a user who adds or completes at least one task, a minimum of three days a week. This way, we can objectively measure the usefulness of Productive, instead of its marketing. 

## Branching Stratagy

### General flow

We chose to use the git flow for our branching stratagy. As such we will create "dev task" branches off of a stable `Develop` branch.

### Branch Creation

The name of the branches will be of the form: [dev task id]-[dev task name].

New branches will be created by running `git checkout -b [branch name]` off of the stable develop branch.  

### Merge Requests

Prior to posting merge requests, branches will run `git fetch` and `git pull origin develop`. Resolving all merge conflicts and re-testing the feature branch.

When writing merge requests, the requester will include a short summary explaining how the branch solves the issue described in the dev task.

When reviewing merge requests, the requestee will check the posted code meets coding standards. Additionally, the requestee will pull the change branch and run all unit tests, and perform a manual system test. If code passes all stages, it is approved and merged with `develop`.