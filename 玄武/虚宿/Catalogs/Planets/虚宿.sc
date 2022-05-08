// 虚宿增二(SB**)
Star "HD 200790 A"
{
	ParentBody "HD 200790"
	Class      "F8V"
  MassSol    1.39
	RadSol     1.2
  Luminosity 4.98
	Teff       6213
  FeH        -0.18
  Age        3.07

	Orbit
	{
    PeriodDays      1975.76
    Eccentricity    0.3937
    Epoch           2451004.7
		ArgOfPericenter 194.22
    MeanAnomaly     0
    //SemiAmplitude   10.585
	}
}

Star "HD 200790 B"
{
	ParentBody "HD 200790"
	Class      ""
  MassSol    1

  Orbit
	{
    PeriodDays      1975.76
    Eccentricity    0.3937
    Epoch           2451004.7
		ArgOfPericenter 14.22
    MeanAnomaly     0
	}
}

// 虚宿增四(***)
Remove "EPS Equ (ABC)"{ParentBody "EPS Equ"}
Remove "EPS Equ D"{ParentBody "EPS Equ"}
Remove "EPS Equ (AB)"{ParentBody "EPS Equ (ABC)"}
Remove "EPS Equ C"{ParentBody "EPS Equ (ABC)"}
Remove "EPS Equ A"{ParentBody "EPS Equ (AB)"}
Remove "EPS Equ B"{ParentBody "EPS Equ (AB)"}
Barycenter "HD 199766 AB"
{
  ParentBody "HD 199766"
  BinaryOrbit
  {
    Separation      540
    Inclination     110.9
    AscendingNode   253.9
    ArgOfPericenter 360
    Epoch           2415020.31352
    MeanAnomaly     0
  }
}

Barycenter "HD 199766 A"
{
  ParentBody "HD 199766 AB"
  Orbit
	{
    Period          101.485
    Eccentricity    0.705
    Inclination     92.17
    AscendingNode   105.15
    Epoch           2422460.29710917
		ArgOfPericenter 160.19
    MeanAnomaly     0
	}
}

Star "HD 199766 A1"
{
	ParentBody "HD 199766 A"
	Class      "F5V"
  MassSol    1.74
	Teff       6223

  Orbit
  {
    PeriodDays      2.03133
    ArgOfPericenter 0
    MeanAnomaly     0
  }
}

Star "HD 199766 A2"
{
	ParentBody "HD 199766 A"
	Class      "F"

  Orbit
  {
    PeriodDays      2.03133
    ArgOfPericenter 180
    MeanAnomaly     0
  }
}

Star "HD 199766 B"
{
	ParentBody "HD 199766 AB"
	Class      "F6V"
  MassSol    1.53
  Teff       6399
  Age        1.5

  Orbit
	{
    Period          101.485
    Eccentricity    0.705
    Inclination     92.17
    AscendingNode   105.15
    Epoch           2422460.29710917
		ArgOfPericenter 340.19
    MeanAnomaly     0
	}
}

Star "HD 199766 C/HIP 103571"
{
	ParentBody "HD 199766"
	Class      "F"

  /*BinaryOrbit
  {
    Separation      540
    Inclination     110.9
    AscendingNode   253.9
    ArgOfPericenter 180
    Epoch           2415020.31352
    MeanAnomaly     0
  }*/
}

// 司非增一(**)
Star	"HD 201616 A"
{
	ParentBody     "HD 201616"
	Class          "A2Vs"
	MassSol        2.59
	RadSol         1.7
	Luminosity     70.6
	Teff           9078
	Age            0.97

	Orbit
	{
		RefPlane        "Equator"
		Period          3353.14593
		Eccentricity    0.0903159678
		Inclination     -0.13155365
		AscendingNode   0
		ArgOfPericenter 119.367036
		MeanAnomaly     -89.6372272
	}
}

Star	"HD 201616 B"
{
	ParentBody     "HD 201616"
	Class          "F2.5 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          3353.14593
		Eccentricity    0.0903159678
		Inclination     -0.13155365
		AscendingNode   0
		ArgOfPericenter 299.367036
		MeanAnomaly     -89.6372272
	}
}

// 司非增二(*Pl)
Remove "Arion"{ParentBody "Musica"}
Planet	"HD 199665 b"
{
	ParentBody     "HD 199665"
	DiscMethod     "RadVel"
	DiscDate       "2008" // Sato et al., Okayama Planet Search Program, 2008.02.19
	Mass           3273.632314

	Orbit
	{
		SemiMajorAxis   2.6
		Eccentricity    0.08
		PeriodDays      993.3
		Epoch           2451672
		ArgOfPericenter 166.1
		MeanAnomaly     0
	}
}

// 哭增一(RS**)
Star	"HD 206301 A"
{
	ParentBody     "HD 206301"
	Class          "G1IV"
	MassSol        1.09
	RadSol         2.6
	Teff           5634
	FeH            -0.1
	Age            6.7

	Orbit
	{
		PeriodDays      13.174
		Eccentricity    0.1763
		Epoch           2447863.626
		ArgOfPericenter 346.45
		MeanAnomaly     0
		//SemiAmplitude   25.57
	}
}

Star	"HD 206301 B"
{
	ParentBody     "HD 206301"
	Class          "G2V"

	Orbit
	{
		PeriodDays      13.174
		Eccentricity    0.1763
		Epoch           2447863.626
		ArgOfPericenter 166.45
		MeanAnomaly     0
		//SemiAmplitude   35.16
	}
}

// 败臼增一(PM**)
Star	"HD 213398 A"
{
	ParentBody     "HD 213398"
	Class          "A1V"
	MassSol        2.33
	RadSol         2.1
	Luminosity     37
	Teff           9638
	Age            0.339

	BinaryOrbit
	{
		Separation      1327.14
	}
}

Star	"HD 213398 B"
{
	ParentBody     "HD 213398"
	Class          "A2V"

	/*BinaryOrbit
	{
		Separation      1327.14
	}*/
}
