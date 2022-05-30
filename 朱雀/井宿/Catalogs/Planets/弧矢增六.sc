// Stars in Tau Canis Majoris Cluster
// Wikipedia: https://en.wikipedia.org/wiki/Tau_Canis_Majoris
// NOIRLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=35415

Remove "TAU Cma (ABC)"{ParentBody "TAU Cma"}
Remove "TAU Cma D"{ParentBody "TAU Cma"}
Remove "TAU Cma (AB)"{ParentBody "TAU Cma (ABC)"}
Remove "TAU Cma C"{ParentBody "TAU Cma (ABC)"}
Remove "TAU Cma A"{ParentBody "TAU Cma (AB)"}
Remove "TAU Cma B"{ParentBody "TAU Cma (AB)"}

// ----------Main Barycenter---------- //
Barycenter "TAU CMa A"
{
  ParentBody "TAU CMa"
  Orbit
	{
    RefPlane        "Static"
	}
}

// ----------A's Component---------- //
// Obs. 118 7 1998 Stickland et al.: quadruple, Ab is eclipsing, RV(P) const
Barycenter "TAU CMa Aa"
{
  ParentBody "TAU CMa A"
  Orbit // SB9_444 1998Obs...118....7S
	{
		Period          154.9168
    Epoch           2443632.398
		Eccentricity    0.285
		ArgOfPericenter 261
		MeanAnomaly     0
	}
}

Barycenter "TAU CMa Ab/TAU CMa P"
{
  ParentBody "TAU CMa A"
  Orbit
	{
		Period          154.9168
    Epoch           2443632.398
		Eccentricity    0.285
		ArgOfPericenter 81
		MeanAnomaly     0
	}
}

// The primary component A is itself a spectroscopic binary with a period of 154.918 days.
Star	"TAU CMa Aa1"
{
	ParentBody     "TAU CMa Aa"
	Class          "O9II"
	MassSol        50
	RadSol         19.8
	Luminosity     280000
	Teff           32000

	Orbit
	{
		PeriodDays      154.918
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"TAU CMa Aa2"
{
	ParentBody     "TAU CMa Aa"
	Class          ""
  MassSol        35.6

	Orbit
	{
    PeriodDays      154.918
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// Cluster NGC 2362: m-M=9.77, Eb-v=0.12. Ampl. of eclipses 0.05m, P=1.282122d.
Star	"TAU CMa Ab1"
{
	ParentBody     "TAU CMa Ab"
	Class          "B0.5V"
	MassSol        17.8

	Orbit
	{
		PeriodDays      1.282122
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"TAU CMa Ab2"
{
	ParentBody     "TAU CMa Ab"
	Class          "B0.5V"
  MassSol        17.8

	Orbit
	{
    PeriodDays      1.282122
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// B, C, D maybe just cluster members
// Uncomment B, C, D designations to turn it into an octuple system.
/* Star	"2MASS J07184309-2457156/TAU CMa B"
{
	ParentBody     "TAU CMa"
	Class          "B"

  Orbit
	{
		SemiMajorAxis   12313.6
		Eccentricity    0.00125126
		Inclination     -178.625954
		AscendingNode   -220.820948
		ArgOfPericenter -13.740458
		MeanAnomaly     61.2067019
	}
}

Star	"2MASS J07184354-2457128/TAU CMa C"
{
	ParentBody     "TAU CMa"
	Class          "B"

  Orbit
	{
		SemiMajorAxis   21489.6
		Eccentricity    0
		Inclination     22.8907132
		AscendingNode   -101.679389
		ArgOfPericenter 46.7175573
		MeanAnomaly     134.656489
	}
}

Star	"CD-24 5180/TAU CMa D"
{
	ParentBody     "TAU CMa"
	Class          "B2V"

  Orbit
	{
    SemiMajorAxis   125223
		Eccentricity    0.0763358779
		Inclination     123.664122
		AscendingNode   -101.679389
		ArgOfPericenter 112.671756
		MeanAnomaly     57.7099237
	}
} */

Star	"TAU CMa E"
{
	ParentBody     "TAU CMa"
	Class          ""
  MassSol        4.89

  Orbit
	{
    SemiMajorAxis   1383.8
	}
}
