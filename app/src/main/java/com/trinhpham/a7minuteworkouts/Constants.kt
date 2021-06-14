package com.trinhpham.a7minuteworkouts

class Constants {
    companion object {
        fun defaultExerciseList(): ArrayList<ExerciseModel> {
            val exerciseList = ArrayList<ExerciseModel>()

            val jumpingJacks = ExerciseModel(
                1, "Jumping Jacks",
                R.drawable.ic_jumping_jack2, false, false,
                arrayListOf(
                    "Place the box in front of you with arms in a natural position by your side.",
                    "Step onto the box with your right first and then step on to the box with your left leg",
                    "Step back off the box with your right foot first and then followed by your left.",
                    "Repeat, leading with your alternate foot first and repeat for desired repetitions. "
                )
            )
            exerciseList.add(jumpingJacks)

            val wallSit = ExerciseModel(
                2, "Wall Sit",
                R.drawable.ic_wallsit, false, false,
                arrayListOf(
                    "Sit on the box with toes pointing forward and legs wider than shoulder width apart.",
                    "Keep your arms out in front and hands together for balance",
                    "Land with your knees bent and take a big breath in as you lower back to the starting position.",
                    "Not allowing your muscles to rest, repeat the movement as your bottom touches the box. "
                )
            )
            exerciseList.add(wallSit)

            val pushUp = ExerciseModel(
                3, "Push Up",
                R.drawable.ic_pushup, false, false,
                arrayListOf(
                    "Start with the box in front of you with your arms down by your side",
                    "Put your right foot on the left centre side of the step box with toes facing at a 45-degree angle.",
                    "Repeat the movement on the opposite side."
                )
            )
            exerciseList.add(pushUp)

            val abdominalCrunch = ExerciseModel(
                4, "Abdominal Crunch",
                R.drawable.ic_abdominalccrunch, false, false,
                arrayListOf(
                    "Place the box long ways on the floor.",
                    "Get into a press position with hands either side of the box and your chest over the middle of the box.",
                    "Now place one hand onto the box and push down firmly to then lever your other arm onto the box.",
                    "Now remove one hand at a time back to the floor before repeating the movement."
                )
            )
            exerciseList.add(abdominalCrunch)

            val stepUpOnChair = ExerciseModel(
                5, "Step-Up onto Chair",
                R.drawable.ic_stepup, false, false,
                arrayListOf(
                    "Using your right leg, step onto the box and push through your front heel to lift your left leg up.",
                    "Repeat for desired repetitions, before switching legs."
                )
            )
            exerciseList.add(stepUpOnChair)

            val squat = ExerciseModel(
                6, "Squat",
                R.drawable.ic_squat, false, false,
                arrayListOf(
                    "Stand with the step in front of you with hands together.",
                    "Repeat the movement for desired number of reps."
                )
            )
            exerciseList.add(squat)

            val tricepDipOnChair = ExerciseModel(
                7, "Tricep Dip On Chair",
                R.drawable.ic_tricepdip, false, false,
                arrayListOf(
                    "Place the plyometric box in front of you and stand behind it with feet shoulder width apart.",
                    "Put your right foot on the left centre side of the step box with toes facing at a 45-degree angle.",
                    "Repeat this movement on the opposite side."
                )
            )
            exerciseList.add(tricepDipOnChair)

            val plank = ExerciseModel(
                8, "Plank",
                R.drawable.ic_plank, false, false,
                arrayListOf(
                    "Start with the box in front of you and arms in a natural position",
                    "Put your right foot on the left centre side of the step box with toes facing at a 45-degree angle.",
                    "Keeping your right foot stable, bring your left knee up in a fast motion whilst touching your hands together."
                )
            )
            exerciseList.add(plank)

            val highKneesRunningInPlace = ExerciseModel(
                9, "High Knees Running In Place",
                R.drawable.ic_highknees, false, false,
                arrayListOf(
                    "Start with the plyo box in front of you and feet wider than shoulder width apart.",
                    "With a small jump bring your feet in together until they touch, before jumping back out."
                )
            )
            exerciseList.add(highKneesRunningInPlace)

            val lunges = ExerciseModel(
                10, "Lunges",
                R.drawable.ic_lunge, false, false,
                arrayListOf(
                    "Start with the box in front of you with your arms down by your side",
                    "Put your right foot on the left centre side of the step box with toes facing at a 45-degree angle.",
                    "Repeat the movement on the opposite side.\n"
                )
            )
            exerciseList.add(lunges)

            val pushupAndRotation = ExerciseModel(
                11, "Push up and Rotation",
                R.drawable.ic_pushuprotation, false, false,
                arrayListOf(
                    "Place the step with the small end facing you and stand either side of the box, feet facing forward.",
                    "Jump with both feet with the aim to land in the middle of the box with feet touching or close to touching.",
                    "Spring your feet back off the box and go into a squat down over the box in a controlled fashion."
                )
            )
            exerciseList.add(pushupAndRotation)

            val sidePlank = ExerciseModel(
                12, "Side Plank",
                R.drawable.ic_sideplank, false, false,
                arrayListOf(
                    "Release in a controlled movement and repeat on the opposite side.",
                    "Start with the box in front of you with your arms down by your side",
                    "Put your right foot on the left centre side of the step box with toes facing at a 45-degree angle."
                )
            )
            exerciseList.add(sidePlank)

            return exerciseList
        }

        fun defaultURLVideo(): ArrayList<String> {
            return arrayListOf(
                "https://firebasestorage.googleapis.com/v0/b/workout-ca8ce.appspot.com/o/video.mp4?alt=media&token=3a01bf62-a860-44a6-8805-f55bec4e9fa6",
                "https://firebasestorage.googleapis.com/v0/b/workout-ca8ce.appspot.com/o/video%20(1).mp4?alt=media&token=6e92cad8-2c20-4433-858d-1818a09d5239",
                "https://firebasestorage.googleapis.com/v0/b/workout-ca8ce.appspot.com/o/video%20(2).mp4?alt=media&token=207d8a0e-4650-4947-a648-cf67ee25b82e",
                "https://firebasestorage.googleapis.com/v0/b/workout-ca8ce.appspot.com/o/video%20(3).mp4?alt=media&token=fa3cb666-831b-442e-8db6-674e5d25d37d",
                "https://firebasestorage.googleapis.com/v0/b/workout-ca8ce.appspot.com/o/production%20ID_3761089.mp4?alt=media&token=470ab244-9316-4352-a29f-f4ad74992aa1"
            )
        }
    }
}