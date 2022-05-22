// 司怪增三(SB**)
Star	"HD 39698 A"
{
	ParentBody     "HD 39698"
	Class          "B2V"
  RadSol         6.55
  Teff           13196

	Orbit
	{
		RefPlane        "Equator"
		Period          26.4531284
		Eccentricity    0.406716347
		Inclination     -0.495957136
		AscendingNode   0
		ArgOfPericenter 135.646128
		MeanAnomaly     26.3967502
	}
}

Star	"HD 39698 B"
{
	ParentBody     "HD 39698"
	Class          "B4.7 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          26.4531284
		Eccentricity    0.406716347
		Inclination     -0.495957136
		AscendingNode   0
		ArgOfPericenter 315.646128
		MeanAnomaly     26.3967502
	}
}

// 司怪增四(SB**)
Star	"HD 41040 A"
{
	ParentBody     "HD 41040"
	Class          "B8 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.369231607
		Eccentricity    0.582075059
		Inclination     -1.07445264
		AscendingNode   0
		ArgOfPericenter -126.161229
		MeanAnomaly     25.1346113
	}
}

Star	"HD 41040 B"
{
	ParentBody     "HD 41040"
	Class          "B8.3 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.369231607
		Eccentricity    0.582075059
		Inclination     -1.07445264
		AscendingNode   0
		ArgOfPericenter 53.8387709
		MeanAnomaly     25.1346113
	}
}

// 司怪增五(**)
Star	"HD 42509 A"
{
	ParentBody     "HD 42509"
	Class          "B9.5V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.53680884
		Eccentricity    0.570787728
		Inclination     0.101998806
		AscendingNode   0
		ArgOfPericenter 24.192499
		MeanAnomaly     -141.861697
	}
}

Star	"HD 42509 B"
{
	ParentBody     "HD 42509"
	Class          "G1.2 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.53680884
		Eccentricity    0.570787728
		Inclination     0.101998806
		AscendingNode   0
		ArgOfPericenter 204.192499
		MeanAnomaly     -141.861697
	}
}

// 座旗增三(**)
Star	"HD 50037 A"
{
	ParentBody     "HD 50037"
	Class          "A8"
	//Teff           6223
	FeH            0.04
	Age            1.7

	Orbit
	{
		Period          271.1
		Eccentricity    0.487
		Inclination     58.4
		AscendingNode   156.4
		Epoch           2452537.99217878
		ArgOfPericenter 239.7
		MeanAnomaly     0
	}
}

Star	"HD 50037 B"
{
	ParentBody     "HD 50037"
	Class          "G0"

	Orbit
	{
		Period          271.1
		Eccentricity    0.487
		Inclination     58.4
		AscendingNode   156.4
		Epoch           2452537.99217878
		ArgOfPericenter 59.7
		MeanAnomaly     0
	}
}

// 座旗增十一(**)
Star	"座旗增十一/20 Lyn A/Struve 1065/HIP 35731 A/SAO 26306/HD 57067/WDS J07223+5009A"
{
	ParentBody     "20 Lyn"
	Class          "A8V"

	BinaryOrbit
	{
		Separation      2296.89
	}
}

Star	"20 Lyn B/HIP 35731 B/SAO 26305/HD 57066"
{
	ParentBody     "20 Lyn"
	Class          "A6V"

	/*BinaryOrbit
	{
		Separation      2296.89
	}*/
}
