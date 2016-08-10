 
#WikiLearn




Group Name: WikiLearn
Team Member Names: Tessa Jensen, Archana Venkatesh, Rainbow(Laan) Yeung
Github repo link: https://github.com/starlinks/WikiLearn

What are we going to build?
What is the mission of your product?

What aspect of the project are you most passionate about improving?

To make searching easier for the user


Which features are your top three most important features to accomplish this mission?
Visual prompt, machine learning to provide better search suggestions, store a list of terms the user has searched



Of those three features, rank your first, second and third priority.
Command line prompt or visual
Machine Learning(TensorFlow or Google Vision )
A history of what the user searches ,


How are we going to build the product?

1. User-observed difference? How will the user notice a difference? Give a specific example of your new improvement working. For example: “When the user enters ‘apples’ the app, the user currently sees pages X,Y and Z from wikipedia. After completing this feature, the user will see pages A,B and C.” If it’s a performance enhancement, make sure to mention the metric you are interested in. For example: “Currently, the user has to wait 5 seconds for results from the search `apple`. After completing this feature, the results should take only 1 second to retrieve.”

There will be a visual output of results as well as more user-friendly search results.
Starting Mock:


Advanced mock:

2. Outline of Approach: For each of the three features, what is the high level of your approach to getting the user observable result?

	Visual Prompt - Java or Javascript/HTML visuals depending on web or PC-based approach
	Machine Learning - Python, train models with previous search data and produce suitable search suggestions
	Results Record - Store in the cloud or local data  ( google cloud storage, AWS, Azure)
3. Further Research: What don’t you know that you need to know to complete these features?
Tensorflow - how it works, how to produce metadata to form search suggestions
Webapp - Google App Engine


4. How will you break down the work? Who will work on what? Can you divide each feature into smaller chunks? What are those chunks?

Machine Learning (Rainbow)- decide on a model, train model with existing data, write a script to provide search suggestions, generate metadata, link metadata to webapp (Tessa), create a dockerfile with trained model
Results Record -(Archana) Researching best storage, learning how to store search result data in the cloud, connecting our data to the cloud, figure out how to use the results record to help with machine learning
Webapp (Tessa) - Research how to create webapp, Front end design, connect backend to support various functions

5. What will the most challenging part be? What do you expect to be the hardest part, and how will you approach it?

Implementing the machine learning will be difficult as well as connecting all of our separate pieces together to create a working final product. 

