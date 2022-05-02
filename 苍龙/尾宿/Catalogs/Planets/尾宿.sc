// 尾宿增四(SB**)
Star	"HD 162391 A"
{
	ParentBody     "HD 162391"
	Class          "G8III"

	Orbit
	{
		RefPlane        "Equator"
		Period          7099.73954
		Eccentricity    0.880596638
		Inclination     1.04754817
		AscendingNode   0
		ArgOfPericenter -160.99254
		MeanAnomaly     61.0192061
	}
}

Star	"HD 162391 B"
{
	ParentBody     "HD 162391"
	Class          "B8 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          7099.73954
		Eccentricity    0.880596638
		Inclination     1.04754817
		AscendingNode   0
		ArgOfPericenter 19.0074601
		MeanAnomaly     61.0192061
	}
}

// 天江增二(**)
Star	"HD 156252 A"
{
	ParentBody     "HD 156252"
	Class          "B9.5V"

	BinaryOrbit
	{
		Separation      917.339
	}
}

Star	"HD 156252 B"
{
	ParentBody     "HD 156252"
	Class          "M2.8 V"

	BinaryOrbit
	{
		Separation      917.339
	}
}

// 天江增七(PM**)
Star	"HD 156897 A"
{
	ParentBody     "HD 156897"
	Class          "F2V"
	MassSol        1.3
	RadSol         1.59
	Luminosity     4.429
	Teff           6611
	FeH            -0.27
	Age            0.916

	BinaryOrbit
	{
		Epoch           2457023.16637981
		Separation      607.6
		PositionAngle   27
	}
}

Star	"HD 156897 B"
{
	ParentBody     "HD 156897"
	Class          "G6.8 V"

	BinaryOrbit
	{
		Epoch           2457023.16637981
		Separation      607.6
		PositionAngle   27
	}
}

// 天江增九(**)
Star	"HD 153363 A"
{
	ParentBody     "HD 153363"
	Class          "F3V"

	Orbit
	{
		RefPlane        "Equator"
		Period          345.016466
		Eccentricity    0.463219225
		Inclination     -0.431036711
		AscendingNode   0
		ArgOfPericenter -66.1771437
		MeanAnomaly     -19.9409148
	}
}

Star	"HD 153363 B"
{
	ParentBody     "HD 153363"
	Class          "F9.1 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          345.016466
		Eccentricity    0.463219225
		Inclination     -0.431036711
		AscendingNode   0
		ArgOfPericenter 113.822856
		MeanAnomaly     -19.9409148
	}
}
