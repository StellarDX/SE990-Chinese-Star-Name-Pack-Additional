// 房宿增一(SB**)
Remove "LAM Lib A"{ParentBody "LAM Lib"}
Remove "LAM Lib B"{ParentBody "LAM Lib"}
Star "HD 142096 A"
{
	ParentBody "HD 142096"
	Class      "B3V"
	MassSol    6.3

	Orbit
	{
		PeriodDays      14.4829
		Eccentricity    0.27
    Epoch           2435172.38
		ArgOfPericenter 37
		MeanAnomaly     0
    //SemiAmplitude   28.5
	}
}

Star "HD 142096 B"
{
	ParentBody "HD 142096"
	Class      "F3.8 V"

	Orbit
	{
    PeriodDays      14.4829
		Eccentricity    0.27
    Epoch           2435172.38
		ArgOfPericenter 217
		MeanAnomaly     0
	}
}

// 房宿增五
Star "HD 142114 A"
{
	ParentBody "HD 142114"
	Class      "B2.5Vn"
	MassSol    6.9
  Luminosity 457.4
  Teff       20350
  Age        0.0304

	BinaryOrbit
	{
    Epoch           2456657.92418103
    Separation      309.15
    PositionAngle   268.28
	}
}

Star "HD 142114 B"
{
	ParentBody "HD 142114"
	Class      "F8.7 V"

  /* BinaryOrbit
	{
    Epoch           2456657.92418103
    Separation      309.15
    PositionAngle   268.28
	} */
}

// 罚增三(*Pl)
Remove "17 Sco b"{ParentBody "17 Sco"}
Planet	"HD 145897 b"
{
	ParentBody     "HD 145897"
	DiscMethod     "RadVel"
	DiscDate       "2020"
	Class          "GasGiant"
	Mass           1373.0186016

	Orbit
	{
		SemiMajorAxis   1.45
		PeriodDays      573.4
		Eccentricity    0.06
	}
}

// 日增一(**)
Star	"HD 139446 A"
{
	ParentBody     "HD 139446"
	Class          "G8III"

	Orbit
	{
		RefPlane        "Equator"
		Period          616.816444
		Eccentricity    0.875157654
		Inclination     0.164687395
		AscendingNode   0
		ArgOfPericenter 146.991929
		MeanAnomaly     -153.41281
	}
}

Star	"HD 139446 B"
{
	ParentBody     "HD 139446"
	Class          "K5.4 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          616.816444
		Eccentricity    0.875157654
		Inclination     0.164687395
		AscendingNode   0
		ArgOfPericenter 326.991929
		MeanAnomaly     -153.41281
	}
}
